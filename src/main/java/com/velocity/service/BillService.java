package com.velocity.service;

import java.util.List;

import com.velocity.model.Bill;

public interface BillService {
	
	//Design the Restful API to get the bill details
	public List<Bill> getBillDetails();
}
