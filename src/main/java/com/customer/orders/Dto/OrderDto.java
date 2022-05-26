package com.customer.orders.Dto;

public class OrderDto {
	
	private int customerId;
	private int itemId;
	private int quantity;
	private String orderDate;
	private String expectedDate;
	
    
	
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getExpectedDate() {
		return expectedDate;
	}
	public void setExpectedDate(String expectedDate) {
		this.expectedDate = expectedDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "OrderDto [customerId=" + customerId + ", itemId=" + itemId + ", quantity=" + quantity + ", addressId="
				 + ", orderDate=" + orderDate + ", expectedDate=" + expectedDate + "]";
	}



}
