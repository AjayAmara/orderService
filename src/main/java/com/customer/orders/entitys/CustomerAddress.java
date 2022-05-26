package com.customer.orders.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_address")
public class CustomerAddress {
	
	@Id
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "customer_address")
	private String customerAddress;
	
	@Column(name = "customer_name")
	private String customerName;

	public CustomerAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



	public CustomerAddress(int customerId, String customerAddress, String customerName) {
		super();
		this.customerId = customerId;
		this.customerAddress = customerAddress;
		this.customerName = customerName;
	}


	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "CustomerAddress [customerId=" + customerId + ", customerAddress=" + customerAddress + ", customerName="
				+ customerName + "]";
	}

	
	

}
