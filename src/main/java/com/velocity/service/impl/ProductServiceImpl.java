package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Product;
import com.velocity.repository.ProductRepository;
import com.velocity.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	//inject ProductRepository reference 
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void cancleProductById(int id) {

		productRepository.deleteById(id);

	}

}
