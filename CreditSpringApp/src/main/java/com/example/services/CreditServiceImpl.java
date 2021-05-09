package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.models.Credit;
import com.example.repositories.CreditRepository;

@Service
public class CreditServiceImpl implements CreditService {
	
	@Autowired
	CreditRepository creditRepository;

	@Override
	public List<Credit> getAllCredits() {
		return creditRepository.getAllCredits();
	}

}
