package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dto.ProductDTO;
import com.example.repositories.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping(path = "/products")
	@ResponseBody
	public List<ProductDTO> getProducts(){
		
		List<ProductDTO> products = productRepository.getAllProducts();

		return products;
	}
	
	@GetMapping(path = "/create-product")
	@ResponseBody
	public void createProduct(ProductDTO product){
		
		product = new ProductDTO();
		product.setProductName("XDF");
		product.setValue(120203);
		
		productRepository.createProduct(product);
	}

}
