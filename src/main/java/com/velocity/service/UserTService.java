package com.velocity.service;

import java.util.List;

import com.velocity.model.UserT;

public interface UserTService {
	
	public void deleteById(int id);
	public void deleteUserById(int id);
	public List<UserT> getUser();

}
