
//Design the Restful web services for user to login system.


package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.UserLogin;
import com.velocity.repository.UserLoginRepository;
import com.velocity.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	private UserLoginRepository userLoginRepository;

	@Override
	public UserLogin saveUserLogin(UserLogin userLogin) {
		UserLogin userl = userLoginRepository.save(userLogin);
		return userl;
	}

}


