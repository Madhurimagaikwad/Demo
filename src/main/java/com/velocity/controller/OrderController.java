package com.velocity.controller;

import java.util.Optional;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Orders;
import com.velocity.repository.OrderRepository;
import com.velocity.service.OrderService;

@RestController
public class OrderController {

	private static final org.jboss.logging.Logger logger  =LoggerFactory.logger(OrderController.class);
	
	@Autowired
	private OrderService orderService;

	@PostMapping("/saveorder")
	public Orders saveOrderDetails(@RequestBody Orders order) {
		Orders order1=orderService.saveOrdersDetails(order);
		logger.info("In RestController >>getProductList");
		return order1;

	}
	
	@PutMapping("/updateOrderDetails")
	public Orders updateOrderDetails(@RequestBody Orders order) {
		return orderService.updateOrderDetails(order);
	}
	
	@GetMapping("/getorder/{id}")
	public ResponseEntity<Optional<Orders>> getOrderById(@PathVariable("id") Integer id) {
		Optional<Orders> order1=orderService.getOrderById(id);
		return ResponseEntity.ok().body(order1);
	}

}
