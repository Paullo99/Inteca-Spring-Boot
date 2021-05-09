package com.example.models;

public class Product {
	
	private int creditId;
	private String productName;
	private int value;
	
	public Product() {}
	
	public Product(int creditId, String productName, int value) {
		super();
		this.creditId = creditId;
		this.productName = productName;
		this.value = value;
	}

	public int getCreditId() {
		return creditId;
	}

	public void setCreditId(int creditId) {
		this.creditId = creditId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	

}
