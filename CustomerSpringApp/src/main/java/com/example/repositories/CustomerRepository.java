package com.example.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.models.Customer;

@Repository
public class CustomerRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Customer> getAllCustomers(){
		String sql = "SELECT CreditID, FirstName, Surname, Pesel FROM Customer";

		return jdbcTemplate.query(sql, (resultSet, rowNum) -> {
			Customer customer = new Customer();
			customer.setCreditId(resultSet.getInt("CreditId"));
			customer.setFirstName(resultSet.getString("FirstName"));
			customer.setSurname(resultSet.getString("Surname"));
			customer.setPesel(resultSet.getString("Pesel"));
			return customer;
		});
	}
	
	public void createCustomer(Customer customer) {
		String sql = "INSERT INTO Customer(CreditID, FirstName, Surname, Pesel) VALUES(?,?,?,?)";
		
		jdbcTemplate.update(sql, customer.getCreditId(), customer.getFirstName(), customer.getSurname(), customer.getPesel());
	}

}
