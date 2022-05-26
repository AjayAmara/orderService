package com.customer.orders.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_header")
public class OrderHeaderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private int  orderId;
	
	@Column(name = "order_date")
	private String orderDate;
	
	@Column(name = "customer_id")
	private int  customerId;
	
	@Column(name = "sales_channel")
	private String salesChannel;
	
	@Column(name = "order_status")
 	private String orderStatus;
	
	

	public OrderHeaderEntity() {
		super();
	}

	public OrderHeaderEntity(int orderId, String orderDate, int customerId, String salesChannel, String orderStatus) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.customerId = customerId;
		this.salesChannel = salesChannel;
		this.orderStatus = orderStatus;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getSalesChannel() {
		return salesChannel;
	}

	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "OrderHeaderEntity [orderId=" + orderId + ", orderDate=" + orderDate + ", customerId=" + customerId
				+ ", salesChannel=" + salesChannel + ", orderStatus=" + orderStatus + "]";
	}
	
	

}
