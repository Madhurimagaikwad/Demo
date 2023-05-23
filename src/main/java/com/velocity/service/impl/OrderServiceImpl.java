package com.velocity.service.impl;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Orders;
import com.velocity.repository.OrderRepository;
import com.velocity.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	private static final org.jboss.logging.Logger logger  =LoggerFactory.logger(OrderServiceImpl.class);
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Orders updateOrder(Orders order) {
		Integer oid=order.getOrderId();
		Orders order1=orderRepository.findById(oid).get();
		order1.setProductName(order.getProductName());
		order1.setPrice(order.getPrice());
		order1.setQuantity(order.getQuantity());
		order1.setUserId(order.getUserId()); 
		logger.info("In SeviceImpl >>updateOrder");
	   return orderRepository.save(order1);
	}

	@Override
	public void deletById(int orderId) {
		orderRepository.deleteById(orderId);
		logger.info("In SeviceImpl >>deleteOrderById");
		
	}

	@Override
	public List<Orders> getOrder() {
		List<Orders> list = (List<Orders>) orderRepository.findAll();
		logger.info("In SeviceImpl >>getListofOrder");
		return list;
	}
	
	@Override
	public Orders saveOrders(Orders orders) {
		Orders orders2 = orderRepository.save(orders);
		logger.info("In SeviceImpl >>saveOrder");
		return orders2;
	}

	@Override
	public Orders saveOrdersDetails(Orders order) {
		Orders order1=orderRepository.save(order);
		logger.info("In SeviceImpl >>saveOrder");
		return order1;
	}

	@Override
	public Orders updateOrderDetails(Orders order) {
		Integer oid=order.getOrderId();
		Orders order1=orderRepository.findById(oid).get();
		order1.setProductName(order.getProductName());
		order1.setPrice(order.getPrice());
		order1.setQuantity(order.getQuantity());
		order1.setUserId(order.getUserId()); 
		logger.info("In SeviceImpl >>updateOrder");
	   return orderRepository.save(order1);
		
		
	}

	@Override
	public Optional<Orders> getOrderById(int orderId) {
	Optional<Orders> order1= orderRepository.findById(orderId);
		return order1;
	}
	

}
