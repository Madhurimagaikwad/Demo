package com.velocity.repository;

import org.springframework.data.repository.CrudRepository;

import com.velocity.model.Orders;

public interface OrderRepository extends CrudRepository<Orders, Integer>{

}
