package com.velocity.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.velocity.model.Product;
import com.velocity.service.ProductService;

import com.velocity.service.ProductService;

@RestController
public class ProductController {

	
	// inject ProductService reference
	
	@Autowired
	private ProductService productService;
	/* Author Anushka */
	@DeleteMapping("/cancleProductById/{id}")
	public void cancleProductById(@PathVariable("id") int id)
	{
		productService.cancleProductById(id);
		

	private static final org.jboss.logging.Logger logger  =LoggerFactory.logger(ProductController.class);
	
	@Autowired
	private ProductService productService;
	/* Author Madhurima */
	@GetMapping("/getProduct")
	public ResponseEntity<List<Product>> getProductList() {
		List<Product> plist=productService.getProduct();
		
		logger.info("In RestController >>getProductList");
		
		return ResponseEntity.ok().body(plist) ;
	}

	/* Author Vishal */
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);


	}

}
