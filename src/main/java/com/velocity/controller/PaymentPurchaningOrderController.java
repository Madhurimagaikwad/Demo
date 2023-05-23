package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.User;
import com.velocity.service.UserService;

@RestController
public class PaymentPurchaningOrderController {
	
	// inject userservice
	
	@Autowired
	private UserService userService;
	
	
	/* Author- Anushka*/
	
	@PostMapping("/addPaymentDetailsForPurchaningOrder")
	public User addPaymentDetailsForPurchaningOrder(@RequestBody User user) {
		
		User user2 = userService.addPaymentDetailsForPurchaningOrder(user);
		return user2;
		
	}
	
	
	/* Author- Anushka*/
		
	@GetMapping("/getPaymentDetailsForPurchasingOrder")
	public List<User> getPaymentDetailsForPurchasingOrder()
	{
		
		List<User>userList= userService.getPaymentDetailsForPurchasingOrder();
		return userList;
		
	}
	
	@DeleteMapping("/deletePaymentDetailsForPurchasingOrder/{id}")
	public void deletePaymentDetailsForPurchasingOrder(@PathVariable int id)
	{
		userService.deletePaymentDetailsForPurchasingOrder(id);
	}
	

}

