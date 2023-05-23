package com.velocity.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

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

import com.velocity.service.impl.BillServiceImpl;


@RestController
public class BillController {


	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(BillController.class);

	@Autowired
	private BillService billService;

	/* Author-Madhurima */

	@PostMapping("/saveBill")
	public Bill saveBill(@RequestBody Bill bill) {
		Bill bill2 = billService.saveBill(bill);
		logger.info("In Controller >>saveBill");

		return bill2;

	@Autowired
	private BillService billService;

	/* Author Vishal */
	@PutMapping("/updateBills")
	public Bill updateBill(@RequestBody Bill bill) {
		return billService.updateBill(bill);


	}

}
