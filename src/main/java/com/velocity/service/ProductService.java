package com.velocity.service;

import java.util.List;
import java.util.Optional;

import com.velocity.model.Product;


import com.velocity.model.Product;

public interface ProductService {

	
	
	public void cancleProductById(int id);
	public Product updateProduct(Product product);
	public List<Product> getProduct();
	public Product saveProductCategory(Product product);
	public Optional<Product> getProductCategory(int id);
	


	public Product updateProduct(Product product);


	public List<Product> getProduct();
	
	//Design the API to add the product details into database.
	
	public Product saveProductdetails(Product product);


}
