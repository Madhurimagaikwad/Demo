//Design the Restful web services for user to login system.

package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.UserLogin;
import com.velocity.repository.UserLoginRepository;
import com.velocity.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	// inject UserLoginRepository
	@Autowired
	private UserLoginRepository userLoginRepository;
	
	@Override
	public UserLogin getUserLoginByPassword(String password) {
		UserLogin userLogin= userLoginRepository.getUserLoginByPassword(password);
		return userLogin;
	}

}
