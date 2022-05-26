 package com.customer.orders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.customer.orders.Dto.OrderDto;
import com.customer.orders.entitys.OrderLineEntity;
import com.customer.orders.service.OrderService;


@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	
	 @RequestMapping("/")
	    public String home() {
		 
	        System.out.println("Going home...");
	        return "home";
	    }
	 
	 @GetMapping("/showForm")
	 public String showForm( Model model ) {
		 OrderDto entry = new OrderDto();
		    
		    model.addAttribute("entry", entry);
		    
		   
		    return "entry_form";
		}
	
	
	@PostMapping("/AddOrder")
	public String addOrder(@ModelAttribute("entry") OrderDto orderDto) {
		
		System.out.println("in controller"+ orderDto);
		
		orderService.addAllOrders(orderDto);
		
		return "entry_success";
	}
	
	@PostMapping("/orderLinesForBackOrders/{itemId}")
	public List<OrderLineEntity> checkOrderLineStatus(@PathVariable int itemId){
		
		return orderService.getOrderLines(itemId);
	}
	
	@PostMapping("/modifyStatus/{lineId}")
	public String modifyStatusOfOrderLine(@PathVariable int lineId) {
		
		
		orderService.modifyOrderLineStatus(lineId);
		
		return"team 1";
		
	}


}
