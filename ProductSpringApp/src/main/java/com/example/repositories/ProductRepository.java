package com.example.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dto.ProductDTO;
import com.example.models.Product;

@Repository
public class ProductRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Product> getAllProducts(){
		String sql = "SELECT CreditID, ProductName, Value FROM product";

		return jdbcTemplate.query(sql, (resultSet, rowNum) -> {
			Product product = new Product();
			product.setCreditId(resultSet.getInt("CreditID"));
			product.setProductName(resultSet.getString("ProductName"));
			product.setValue(resultSet.getInt("Value"));
			return product;
		});
	}
	
	public int createProduct(ProductDTO product) {
		String sql = "INSERT INTO product(ProductName, Value) VALUES(?,?)";
		
		return jdbcTemplate.update(sql, product.getProductName(), product.getValue());
	}

}
