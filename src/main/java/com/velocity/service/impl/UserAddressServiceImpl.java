package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.UserAddress;
import com.velocity.repository.UserAddressRepository;
import com.velocity.service.UserAddressService;

@Service
public class UserAddressServiceImpl implements UserAddressService{

	
	//inject UserAddressRepository reference
	
	@Autowired
	private UserAddressRepository userAddressRepository;
	
	@Override
	public UserAddress saveUserAddress(UserAddress userAddress) {
		UserAddress userAddress2= userAddressRepository.save(userAddress);
		
		return userAddress2;
	}

	/*Author Vishal */
	@Override
	public List<UserAddress> getUserAddress() {
		List<UserAddress> useradd=userAddressRepository.findAll();
		return useradd;
	}
	
	

}
