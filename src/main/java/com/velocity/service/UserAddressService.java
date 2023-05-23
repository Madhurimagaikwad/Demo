package com.velocity.service;


import java.util.List;


import com.velocity.model.UserAddress;

public interface UserAddressService {
	
	//Design Restful web services in which user should able to store many address belongs to one user only.
	
	public UserAddress saveUserAddress(UserAddress userAddress);

	//Design RestFul web Services in which user able to get many address from database on userid
	public List<UserAddress> getUserAddress();
	


}
