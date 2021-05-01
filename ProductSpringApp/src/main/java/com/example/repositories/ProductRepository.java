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
	
	public List<ProductDTO> getAllProducts(){
		String sql = "SELECT CreditID, ProductName, Value FROM Product";

		return jdbcTemplate.query(sql, (resultSet, rowNum) -> {
			ProductDTO product = new ProductDTO();
			product.setProductName(resultSet.getString("ProductName"));
			product.setValue(resultSet.getInt("Value"));
			return product;
		});
	}
	
	public void createProduct(ProductDTO product) {
		String sql = "INSERT INTO Product(ProductName, Value) VALUES(?,?)";
		
		jdbcTemplate.update(sql, product.getProductName(), product.getValue());
	}

}
