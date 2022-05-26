package com.customer.orders.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_details")
public class productDetailsEntity {
	
	@Id
	@Column(name = "product_id")
	private int productId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "shelf_life_in_weeks")
	private int shelfLifeInWeeks;
	
	@Column(name = "sales_price_retail")
	private float salesPriceRetail;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getShelfLifeInWeeks() {
		return shelfLifeInWeeks;
	}

	public void setShelfLifeInWeeks(int shelfLifeInWeeks) {
		this.shelfLifeInWeeks = shelfLifeInWeeks;
	}

	public float getSalesPriceRetail() {
		return salesPriceRetail;
	}

	public void setSalesPriceRetail(float salesPriceRetail) {
		this.salesPriceRetail = salesPriceRetail;
	}

	@Override
	public String toString() {
		return "productDetailsEntity [productId=" + productId + ", productName=" + productName + ", shelfLifeInWeeks="
				+ shelfLifeInWeeks + ", salesPriceRetail=" + salesPriceRetail + "]";
	}
	
	
	
}
