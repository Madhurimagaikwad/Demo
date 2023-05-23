package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Transaction;
import com.velocity.repository.TransactionRepository;
import com.velocity.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;

	@Override
	public Transaction getTransactionById(int id) {
		Transaction trans = transactionRepository.findById(id).get();
		return trans;
	}

}
