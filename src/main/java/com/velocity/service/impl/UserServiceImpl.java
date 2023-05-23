package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.User;
import com.velocity.repository.UserRepository;
import com.velocity.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User updateUser(User user) {
		Integer id = user.getId();
		User user2 = userRepository.findById(id).get();
		user2.setUsername(user.getUsername());
		user2.setPassword(user.getPassword());
		user2.setRealName(user.getRealName());
		user2.setGender(user.getGender());
		user2.setUserType(user.getUserType());
		user2.setBirthday(user.getBirthday());
		user2.setOrderlist(user.getOrderlist());

		return userRepository.save(user2);
	}

	@Override
	public List<User> getUser() {
		List<User> list = (List<User>) userRepository.findAll();
		return list;
	}

	@Override
	public User saveUser(User user) {

		User users = userRepository.save(user);
		return users;
	}
	
	

	/* Author - Anushka */

	@Override
	public User addPaymentDetailsForPurchaningOrder(User user) {
		User user2 = userRepository.save(user);
		return user2;
	}

	/* Author - Anushka */

	@Override
	public List<User> getPaymentDetailsForPurchasingOrder() {
		List<User> userList = (List<User>) userRepository.findAll();
		return userList;

	}

	/* Author - Anushka */

	@Override
	public void deletePaymentDetailsForPurchasingOrder(int id) {
		userRepository.deleteById(id);

	}

}
