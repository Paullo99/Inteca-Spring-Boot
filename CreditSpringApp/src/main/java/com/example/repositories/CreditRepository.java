package com.example.repositories;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.dto.CreditDTO;
import com.example.models.Credit;

@Repository
public class CreditRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	SimpleJdbcInsert simpleJdbcInsert;
	
	@Autowired
    public CreditRepository(DataSource dataSource) {
        simpleJdbcInsert = new SimpleJdbcInsert(dataSource)
          .withTableName("Credit").usingGeneratedKeyColumns("id");
    }
	
	public List<Credit> getAllCredits(){
		String sql = "SELECT ID, CreditName FROM Credit";

		return jdbcTemplate.query(sql, (resultSet, rowNum) -> {
			Credit credit = new Credit();
			credit.setId(resultSet.getInt("Id"));
			credit.setCreditName(resultSet.getString("CreditName"));
			return credit;
		});
	}
	
	public int createCredit(CreditDTO credit) {
		
		Map<String, Object> parameters = new HashMap<>(1);
	    parameters.put("CreditName", credit.getCreditName());
	    Number newId = simpleJdbcInsert.executeAndReturnKey(parameters);
	  	return ((BigInteger) newId).intValue();
	}

}
