package com.velocity.service;

import java.util.List;

import com.velocity.model.User;

public interface UserService {

	public User updateUser(User user);
	public List<User> getUser();
	public User saveUser(User user);


	//66. Design Restful API to add the payment details for purchasing order from user.
	
		public User addPaymentDetailsForPurchaningOrder(User user);
		
		//68. Design Restful API to get the payment details for purchasing order from user.
		
		public List<User> getPaymentDetailsForPurchasingOrder();
		
		//Design Restful API to delete the payment details for purchasing order from user.
		
		public void deletePaymentDetailsForPurchasingOrder(int id);
		
		
	}

}

