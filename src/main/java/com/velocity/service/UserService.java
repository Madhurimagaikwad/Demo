package com.velocity.service;

import java.util.List;

import com.velocity.model.User;

public interface UserService {

	public User updateUser(User user);
	public List<User> getUser();
	public User saveUser(User user);

}
