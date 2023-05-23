package com.velocity.service;

import java.util.List;

import com.velocity.model.Cart;

public interface CartService {
	
	public Cart saveCart(Cart cart);
	public List<Cart> getCartDetails();
	

}
