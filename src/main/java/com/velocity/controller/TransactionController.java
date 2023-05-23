package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Transaction;
import com.velocity.service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/getTransact/{id}")
	public Transaction getTransactionById(@PathVariable("id") int id) {
		Transaction transactions =transactionService.getTransactionById(id);
		return transactions;
		
	}

}
