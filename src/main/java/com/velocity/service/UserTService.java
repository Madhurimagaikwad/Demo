package com.velocity.service;

import com.velocity.model.UserT;

public interface UserTService {
	
	public void deleteById(int id);
	
	public UserT saveUserTransactionDetails(UserT userT);

}
