package com.example.dto;

public class CreditDTO {

	private String creditName;
	
	public CreditDTO(String creditName) {
		super();
		this.creditName = creditName;
	}

	public String getCreditName() {
		return creditName;
	}

	public void setCreditName(String creditName) {
		this.creditName = creditName;
	}	
	
}
