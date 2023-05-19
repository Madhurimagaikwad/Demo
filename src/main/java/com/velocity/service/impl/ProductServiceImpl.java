package com.velocity.service.impl;

import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.controller.ProductController;
import com.velocity.model.Product;
import com.velocity.repository.ProductRepository;
import com.velocity.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private static final org.jboss.logging.Logger logger  =LoggerFactory.logger(ProductServiceImpl.class);

	@Autowired
	private ProductRepository productRepository;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProduct() {
	logger.info("In ProductServiceImpl >>getProduct");
		List<Product> product1=(List<Product>) productRepository.findAll();
		return (List<Product>) product1;
		
	}

}
