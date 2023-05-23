package com.velocity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	

}
