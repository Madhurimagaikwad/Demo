package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Cart;
import com.velocity.repository.CartRepository;
import com.velocity.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	// inject cart repository reference

	@Autowired
	private CartRepository cartRepository;

	/*Author  */
	@Override
	public List<Cart> getCartDetails() {
		List<Cart> cart = (List<Cart>) cartRepository.findAll();
		return cart;
	}

	/*Author Vishal */
	@Override
	public Cart saveCart(Cart cart) {
		Cart cart1=cartRepository.save(cart);
		return cart1;
	}	

}
