package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Customer;
import com.example.services.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping(path = "/customers")
	@ResponseBody
	public List<Customer> getCustomers(){

		return customerService.getAllCustomers();
	}
	
	@PostMapping(path = "/createCustomer")
	public void createCustomer(@RequestBody Customer customer){
		customerService.createCustomer(customer);
	}
}
