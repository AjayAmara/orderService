package com.customer.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.orders.entitys.productDetailsEntity;

public interface ProductDetailsRepository extends JpaRepository<productDetailsEntity, Integer> {

}
