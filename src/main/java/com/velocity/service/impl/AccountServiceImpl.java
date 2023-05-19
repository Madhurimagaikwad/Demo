package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Account;
import com.velocity.repository.AccountRepository;
import com.velocity.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Account saveAccount(Account account) {
		Account account1=accountRepository.save(account);
		return  account1;
	}
	
	
}
