package com.velocity.service;

import java.util.List;
import java.util.Optional;

import com.velocity.model.Orders;

public interface OrderService {
	
	public Orders updateOrder(Orders order);
	public void deletById(int orderId);
	public List<Orders> getOrder();
	public Orders saveOrders(Orders orders);
	public Orders  saveOrdersDetails(Orders order);
	public Orders updateOrderDetails(Orders order); 
	public Optional<Orders> getOrderById(int orderId);
}
