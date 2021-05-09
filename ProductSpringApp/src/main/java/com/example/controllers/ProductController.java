package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Product;
import com.example.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping(path = "/products")
	@ResponseBody
	public List<Product> getProducts(){		
		
		return productService.getAllProducts();
	}
	
	@PostMapping(path = "/createProduct")
	public void createProduct(@RequestBody Product product){
		productService.createProduct(product);
	}

}
