package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Reimbursement;
import com.velocity.model.User;
import com.velocity.model.UserAddress;
import com.velocity.service.UserAddressService;
import com.velocity.service.UserService;

@RestController
public class UserAddressController {

	// inject UserService and UserAddressService
	@Autowired
	private UserService userService;

	@Autowired
	private UserAddressService userAddressService;

	@PostMapping("/saveUserAddress")
	public User saveUserAddress(@RequestBody User user) {
		User user2 = userService.saveUser(user);

		List<UserAddress> userAddress = user.getUserAddress();

		for (UserAddress useradd : userAddress) {
			useradd.setUserId(user.getId());
			userAddressService.saveUserAddress(useradd);
		}
		return user2;

	}

	/* Author Vishal */
	@GetMapping("/getUseraddress")
	public List<UserAddress> getUserAddress() {
		return userAddressService.getUserAddress();
	}

}
