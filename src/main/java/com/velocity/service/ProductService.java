package com.velocity.service;
import java.util.List;
import com.velocity.model.Product;

import com.velocity.model.Product;

public interface ProductService {
	
	public void cancleProductById(int id);

	public Product updateProduct(Product product);

	public List<Product> getProduct();

}
