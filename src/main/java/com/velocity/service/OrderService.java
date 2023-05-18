package com.velocity.service;

import com.velocity.model.Orders;

public interface OrderService {
	
	public Orders updateOrder(Orders order);
	public void deletById(int orderId);

}
