package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Cart;
import com.velocity.model.Reimbursement;
import com.velocity.service.CartService;

@RestController
public class CartController {

	// inject service reference

	@Autowired
	private CartService cartService;

	@GetMapping("/getCartDetails")
	public List<Cart> getCartDetails() {
		return cartService.getCartDetails();

	}
	
	/* Author Vishal */
	@PostMapping("/saveCarts")
	public Cart saveCart(@RequestBody Cart cart) {
		Cart cart1=cartService.saveCart(cart);
		return cart1;
	}

}


