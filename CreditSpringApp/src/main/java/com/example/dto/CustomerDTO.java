package com.example.dto;

public class CustomerDTO {
	
	private String firstName;
	private String surname;
	private String pesel;
	
	public CustomerDTO(String firstName, String surname, String pesel) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.pesel = pesel;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

}
