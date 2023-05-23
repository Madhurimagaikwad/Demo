package com.velocity.service;

import com.velocity.model.UserAddress;

public interface UserAddressService {
	
	//Design Restful web services in which user should able to store many address belongs to one user only.
	
	public UserAddress saveUserAddress(UserAddress userAddress);

}
