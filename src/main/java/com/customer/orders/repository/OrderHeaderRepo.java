package com.customer.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.orders.entitys.OrderHeaderEntity;

public interface OrderHeaderRepo extends JpaRepository<OrderHeaderEntity, Integer> {

}
