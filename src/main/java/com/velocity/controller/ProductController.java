package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.service.ProductService;

@RestController
public class ProductController {
	
	// inject ProductService reference
	
	@Autowired
	private ProductService productService;
	
	@DeleteMapping("/cancleProductById/{id}")
	public void cancleProductById(@PathVariable("id") int id)
	{
		productService.cancleProductById(id);
		
	}

}
