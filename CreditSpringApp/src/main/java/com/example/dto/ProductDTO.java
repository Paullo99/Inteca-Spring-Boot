package com.example.dto;

public class ProductDTO {

	private String productName;
	private int value;
	
	public ProductDTO(String productName, int value) {
		super();
		this.productName = productName;
		this.value = value;
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
