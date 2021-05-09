package com.example.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.example.dto.CombinedObject;
import com.example.dto.CreditDTO;
import com.example.dto.CustomerDTO;
import com.example.dto.ProductDTO;
import com.example.models.Credit;
import com.example.models.Customer;
import com.example.models.Product;
import com.example.services.CreditService;

@Controller
public class CreditController {

	@Autowired
	CreditService creditService;

	@Autowired
	RestTemplate restTemplate;

	@GetMapping(path = "/getCredits")
	@ResponseBody
	public List<CombinedObject> getCredits() {

		// Pobranie wszystkich customers oraz produktów z endpointów
		ResponseEntity<Customer[]> responseEntityCustomers = restTemplate
				.getForEntity("http://localhost:8280/customers", Customer[].class);
		ResponseEntity<Product[]> responseEntityProducts = restTemplate.getForEntity("http://localhost:8180/products",
				Product[].class);

		Map<Integer, CustomerDTO> customersMap = Arrays.stream(responseEntityCustomers.getBody()).collect(Collectors
				.toMap(Customer::getCreditId, c -> new CustomerDTO(c.getFirstName(), c.getSurname(), c.getPesel())));

		Map<Integer, ProductDTO> productsMap = Arrays.stream(responseEntityProducts.getBody()).collect(Collectors
				.toMap(Product::getCreditId, p -> new ProductDTO(p.getProductName(), p.getValue())));

		List<Credit> credits = creditService.getAllCredits();
		List<CombinedObject> output = new ArrayList<>();
		CombinedObject combinedObjectTemp = new CombinedObject();

		for (Credit credit : credits) {
			combinedObjectTemp.setCustomer(customersMap.get(credit.getId()));
			combinedObjectTemp.setProduct(productsMap.get(credit.getId()));
			combinedObjectTemp.setCredit(new CreditDTO(credit.getCreditName()));
			output.add(combinedObjectTemp);
		}

		return output;
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
