package com.velocity.controller;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Bill;
import com.velocity.service.BillService;
import com.velocity.service.impl.BillServiceImpl;

@RestController
public class BillController {
	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(BillController.class);

	@Autowired
	private BillService billService;

	@PostMapping("/saveBill")
	public Bill saveBill(@RequestBody Bill bill) {
		Bill bill2 = billService.saveBill(bill);
		logger.info("In Controller >>saveBill");

		return bill2;
	}

}
