package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Account;
import com.velocity.model.Customer;
import com.velocity.service.AccountService;
import com.velocity.service.CustomerService;

@RestController
public class CustomerAccountController {
	


	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private AccountService accountService;
	
	
	@PostMapping("/saveCustomerAccount")
	
	public Customer saveCustomerAccount(@RequestBody Customer customer) {
		Customer customer2=customerService.saveCustomer(customer);
		List<Account> account=customer.getAccountList();
		try {
		for(Account ac:account) {
			ac.setCustId(customer.getCustId());
			accountService.saveAccount(ac);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return customer2;
	
	}
	}
	

