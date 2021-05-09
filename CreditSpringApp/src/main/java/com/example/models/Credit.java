package com.example.models;

public class Credit {
	
	private int id;
	private String creditName;
	
	public Credit() {} 
	
	public Credit(int id, String creditName) {
		super();
		this.id = id;
		this.creditName = creditName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreditName() {
		return creditName;
	}

	public void setCreditName(String creditName) {
		this.creditName = creditName;
	}
	
}
