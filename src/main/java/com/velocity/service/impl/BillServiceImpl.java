package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Bill;
import com.velocity.repository.BillRepository;
import com.velocity.service.BillService;

@Service
public class BillServiceImpl implements BillService {

	// inject BillRepository
	@Autowired
	private BillRepository billRepository;

	@Override
	public List<Bill> getBillDetails() {
		List<Bill> bill = billRepository.findAll();

		return bill;
	}

}
