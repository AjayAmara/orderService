package com.customer.orders.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.customer.orders.Dto.OrderDto;
import com.customer.orders.Dto.OrderLineDto;
import com.customer.orders.entitys.CustomerAddress;
import com.customer.orders.entitys.OrderHeaderEntity;
import com.customer.orders.entitys.OrderLineEntity;
import com.customer.orders.entitys.productDetailsEntity;
import com.customer.orders.repository.CustomerAddressRepository;
import com.customer.orders.repository.OrderHeaderRepo;
import com.customer.orders.repository.OrderLineRepository;
import com.customer.orders.repository.ProductDetailsRepository;

@Service
public class OrderService {

	private final String BACK_ORDER = "Back order";
	private final String PROCESSED = "processed";

	@Autowired
	OrderHeaderRepo headerRepo;

	@Autowired
	OrderLineRepository LineRepository;

	@Autowired
	ProductDetailsRepository productDetailsRepository;

	@Autowired
	CustomerAddressRepository customerAddressRepository;

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	WebClient webClient;

	private static final Logger log = LoggerFactory.getLogger(OrderService.class);

	public void addAllOrders(OrderDto orderDto) {

		String status = orderStatus(orderDto);

		log.info("ststus............." + status);

		OrderHeaderEntity headerEntity = new OrderHeaderEntity();
		List<OrderLineEntity> listOfLineEntity = new ArrayList<OrderLineEntity>();

		Optional<CustomerAddress> customer = customerAddressRepository.findById(orderDto.getCustomerId());
		Optional<productDetailsEntity> productDetailsEntity = productDetailsRepository.findById(orderDto.getItemId());

		System.out.println(productDetailsEntity);

		if (orderDto.getCustomerId() == customer.get().getCustomerId()) {

			OrderLineEntity orderLineEntity = new OrderLineEntity();

			headerEntity.setOrderDate(orderDto.getOrderDate());
			headerEntity.setCustomerId(orderDto.getCustomerId());
			headerEntity.setOrderStatus("processing");
			headerEntity.setSalesChannel("online");

			headerRepo.save(headerEntity);

			orderLineEntity.setItemId(orderDto.getItemId());

			orderLineEntity.setLineStatus(status);

			orderLineEntity.setOrderHeaderId(headerEntity.getOrderId());
			orderLineEntity.setPromisedDate(orderDto.getExpectedDate());
			orderLineEntity.setQuantity(orderDto.getQuantity());
			orderLineEntity.setShipTo(customer.get().getCustomerAddress());
			orderLineEntity.setUnitPrice(productDetailsEntity.get().getSalesPriceRetail());
			listOfLineEntity.add(orderLineEntity);

		}

		LineRepository.saveAll(listOfLineEntity);

	}

	public String orderStatus(OrderDto orderDto) {

		return webClient.post().uri("/checkStatus").syncBody(orderDto).retrieve().bodyToMono(String.class).block();
	}

	public List<OrderLineEntity> getOrderLines(int itemId) {

		List<OrderLineEntity> orderLines = LineRepository.getByItemId(itemId);

		List<OrderLineEntity> backOrderLines = orderLines.stream()
				.filter(order -> order.getLineStatus().equals(BACK_ORDER)).collect(Collectors.toList());

		return backOrderLines;
	}

	public void modifyOrderLineStatus(int lineId) {

		OrderLineEntity orderLineEntity = LineRepository.getByOrderLineNumber(lineId);

		orderLineEntity.setItemId(orderLineEntity.getItemId());
		orderLineEntity.setLineStatus(PROCESSED);
		orderLineEntity.setOrderHeaderId(orderLineEntity.getOrderHeaderId());
		orderLineEntity.setPromisedDate(orderLineEntity.getPromisedDate());
		orderLineEntity.setQuantity(orderLineEntity.getQuantity());
		orderLineEntity.setShipTo(orderLineEntity.getShipTo());
		orderLineEntity.setUnitPrice(orderLineEntity.getUnitPrice());

		LineRepository.save(orderLineEntity);
	}

}
