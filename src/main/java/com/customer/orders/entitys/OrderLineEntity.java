package com.customer.orders.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_line")
public class OrderLineEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_line_number")
	private int orderLineNumber;

	@Column(name = "order_header_id")
	private int orderHeaderId;

	@Column(name = "item_id")
	private int itemId;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "unit_price")
	private float unitPrice;

	@Column(name = "ship_to")
	private String shipTo;

	@Column(name = "line_status")
	private String lineStatus;

	@Column(name = "promised_date")
	private String promisedDate;

	public OrderLineEntity() {
		super();
	}
	
	public OrderLineEntity(int orderLineNumber, int orderHeaderId, int itemId, int quantity, int unitPrice, String shipTo,
			String lineStatus, String promisedDate) {
		super();
		this.orderLineNumber = orderLineNumber;
		this.orderHeaderId = orderHeaderId;
		this.itemId = itemId;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.shipTo = shipTo;
		this.lineStatus = lineStatus;
		this.promisedDate = promisedDate;
	}

	public int getOrderLineNumber() {
		return orderLineNumber;
	}

	public void setOrderLineNumber(int orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

	public int getOrderHeaderId() {
		return orderHeaderId;
	}

	public void setOrderHeaderId(int orderHeaderId) {
		this.orderHeaderId = orderHeaderId;
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

	
	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getShipTo() {
		return shipTo;
	}

	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}

	public String getLineStatus() {
		return lineStatus;
	}

	public void setLineStatus(String lineStatus) {
		this.lineStatus = lineStatus;
	}

	public String getPromisedDate() {
		return promisedDate;
	}

	public void setPromisedDate(String promisedDate) {
		this.promisedDate = promisedDate;
	}

	@Override
	public String toString() {
		return "OrderLineEntity [orderLineNumber=" + orderLineNumber + ", orderHeaderId=" + orderHeaderId + ", itemId="
				+ itemId + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", shipTo=" + shipTo
				+ ", lineStatus=" + lineStatus + ", promisedDate=" + promisedDate + "]";
	}

	

}
