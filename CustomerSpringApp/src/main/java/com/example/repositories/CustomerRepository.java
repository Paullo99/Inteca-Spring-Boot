package com.example.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dto.CustomerDTO;

@Repository
public class CustomerRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<CustomerDTO> getAllCustomers(){
		String sql = "SELECT FirstName, Surname, Pesel FROM Customer";

		return jdbcTemplate.query(sql, (resultSet, rowNum) -> {
			CustomerDTO customer = new CustomerDTO();
			customer.setFirstName(resultSet.getString("FirstName"));
			customer.setSurname(resultSet.getString("Surname"));
			customer.setPesel(resultSet.getString("Pesel"));
			return customer;
		});
	}
	
	public void createCustomer(CustomerDTO customer) {
		String sql = "INSERT INTO Customer(FirstName, Surname, Pesel) VALUES(?,?,?)";
		
		jdbcTemplate.update(sql, customer.getFirstName(), customer.getSurname(), customer.getPesel());
	}

}
