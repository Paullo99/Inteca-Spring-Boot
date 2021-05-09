package com.example.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dto.CreditDTO;
import com.example.models.Credit;

@Repository
public class CreditRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Credit> getAllCredits(){
		String sql = "SELECT ID, CreditName FROM Credit";

		return jdbcTemplate.query(sql, (resultSet, rowNum) -> {
			Credit credit = new Credit();
			credit.setId(resultSet.getInt("Id"));
			credit.setCreditName(resultSet.getString("CreditName"));
			return credit;
		});
	}
	
	public void createCredit(CreditDTO credit) {
		String sql = "INSERT INTO Credit(CreditName) VALUES(?)";
		
		jdbcTemplate.update(sql, credit.getCreditName());
	}

}
