package com.customer.orders.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.orders.entitys.CustomerAddress;

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Integer>{

	Optional<CustomerAddress> findByCustomerId(int customerId);

}
