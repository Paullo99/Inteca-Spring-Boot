package com.example.services;

import java.util.List;

import com.example.dto.CreditDTO;
import com.example.models.Credit;

public interface CreditService {
	
	public List<Credit> getAllCredits();
	public Integer createCredit(CreditDTO credit);
}
