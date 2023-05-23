package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Bill;
import com.velocity.service.BillService;

@RestController
public class BillController {

	// inject BillService
	@Autowired
	private BillService billService;

	@GetMapping("/getBillDetails")
	public List<Bill> getBillDetails() {
		return  billService.getBillDetails();

	}

}
