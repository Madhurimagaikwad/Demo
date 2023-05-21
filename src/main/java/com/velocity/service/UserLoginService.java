package com.velocity.service;

import com.velocity.model.UserLogin;

public interface UserLoginService {
	
	public UserLogin getUserLoginByPassword(String password);

}
