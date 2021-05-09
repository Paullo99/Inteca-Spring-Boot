package com.example.services;

import java.util.List;

import com.example.models.Customer;

public interface CustomerService {
	 public List<Customer> getAllCustomers();
	 public void createCustomer(Customer customer);
}
