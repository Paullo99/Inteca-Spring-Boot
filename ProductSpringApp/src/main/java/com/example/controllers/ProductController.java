package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dto.ProductDTO;
import com.example.models.Product;
import com.example.services.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping(path = "/products")
	@ResponseBody
	public List<Product> getProducts(){
		
		List<Product> products = productService.getAllProducts();

		return products;
	}
	
	@GetMapping(path = "/create-product")
	@ResponseBody
	public void createProduct(ProductDTO product){
		
		product = new ProductDTO();
		product.setProductName("XDF");
		product.setValue(120203);
		
		//productService.createProduct(product);
	}

}
