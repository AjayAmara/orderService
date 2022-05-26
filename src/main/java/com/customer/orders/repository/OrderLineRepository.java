package com.customer.orders.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.orders.entitys.OrderLineEntity;

public interface OrderLineRepository extends JpaRepository<OrderLineEntity,Integer> {

	List<OrderLineEntity> getByItemId(int itemId);

	OrderLineEntity getByOrderLineNumber(int lineId);

}
