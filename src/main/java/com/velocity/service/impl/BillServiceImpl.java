package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Bill;
import com.velocity.repository.BillRepository;
import com.velocity.service.BillService;

@Service
public class BillServiceImpl implements BillService {

	@Autowired
	private BillRepository billRepository;

	/* Author Vishal */
	@Override
	public Bill updateBill(Bill bill) {
		int billId = bill.getBid();
		Bill bill2 = billRepository.findById(billId).get();
		bill2.setBillCode(bill.getBillCode());
		bill2.setBillCom(bill.getBillCom());
		bill2.setBillName(bill.getBillName());
		bill2.setBillNum(bill.getBillNum());
		bill2.setMoney(bill.getMoney());
		bill2.setPid(bill.getPid());
		bill2.setProvider(bill.getProvider());
		return billRepository.save(bill2);
	}

}
