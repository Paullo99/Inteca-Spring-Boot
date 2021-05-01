package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dto.CustomerDTO;
import com.example.repositories.CustomerRepository;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping(path = "/customers")
	@ResponseBody
	public List<CustomerDTO> getCustomers(){
		
		List<CustomerDTO> customers = customerRepository.getAllCustomers();

		return customers;
	}
	
	@GetMapping(path = "/create-customer")
	@ResponseBody
	public void createCustomer(CustomerDTO customer){
		
		customer = new CustomerDTO();
		customer.setFirstName("Paweł");
		customer.setSurname("Przykład");
		customer.setPesel("94213921439214");
		
		customerRepository.createCustomer(customer);
	}

}
