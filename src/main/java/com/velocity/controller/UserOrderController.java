package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Orders;
import com.velocity.model.User;
import com.velocity.service.OrderService;
import com.velocity.service.UserService;
public class UserOrderController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private OrderService orderService;
	
	
	@PutMapping("/updateUserorder")
	public ResponseEntity<User> updateUserOrder( @RequestBody User user  ) {
		
		User user2=userService.updateUser(user);
		try {
	
		List<Orders> order1=user.getOrderlist();
		for(Orders o:order1) {
			o.setUserId(user.getId());
			orderService.updateOrder(o);
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.ok().body(user2);
		
	}
	
	@DeleteMapping("/deleteOrder/{orderId}")
	public void deleteById(@PathVariable("orderId") int orderId) {
		orderService.deletById(orderId);
	}
	

}
