package com.example.dto;

public class CombinedObject {
	private CreditDTO credit;
	private CustomerDTO customer;
	private ProductDTO product;
	
	public CombinedObject() {}
	
	public CombinedObject(CreditDTO credit, CustomerDTO customer, ProductDTO product) {
		super();
		this.credit = credit;
		this.customer = customer;
		this.product = product;
	}
	
	public CreditDTO getCredit() {
		return credit;
	}
	public void setCredit(CreditDTO credit) {
		this.credit = credit;
	}
	public CustomerDTO getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}
	public ProductDTO getProduct() {
		return product;
	}
	public void setProduct(ProductDTO product) {
		this.product = product;
	}
	
}
