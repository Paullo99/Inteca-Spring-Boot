package com.example.services;

import java.util.List;

import com.example.dto.ProductDTO;
import com.example.models.Product;

public interface ProductService {
	 public List<Product> getAllProducts();
	 public int createProduct(Product product);
}
