package com.zuozhekun.entity;

import java.io.Serializable;

public class ProInfo implements Serializable{
	private int productId;
	private String productName;
	private int qty;
	
	public ProInfo() {
		super();
	}
	public ProInfo(int productId, String productName, int qty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.qty = qty;
	}
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
}
