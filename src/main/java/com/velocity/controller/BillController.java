package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Bill;
import com.velocity.service.BillService;

@RestController
public class BillController {

	@Autowired
	private BillService billService;

	/* Author Vishal */
	@PutMapping("/updateBills")
	public Bill updateBill(@RequestBody Bill bill) {
		return billService.updateBill(bill);

	}

}
