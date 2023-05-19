package com.velocity.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product updateProduct(Product product) {
		int id = product.getId();
		Product pro = productRepository.findById(id).get();
		pro.setId(product.getId());
		pro.setProductname(product.getProductname());
		pro.setManufactureddate(product.getManufactureddate());
		pro.setExpirydate(product.getExpirydate());
		pro.setPrice(product.getPrice());
		pro.setProductcode(product.getProductcode());
		pro.setQuantity(product.getQuantity());
		return productRepository.save(pro);


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
