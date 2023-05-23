package com.velocity.service.impl;


import java.util.List;


import org.hibernate.annotations.common.util.impl.LoggerFactory;


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

	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(BillServiceImpl.class);

	@Autowired
	private BillRepository billRepository;

	/* Author-Madhurima */
	@Override
	public Bill saveBill(Bill bill) {
		Bill bill2 = billRepository.save(bill);
		logger.info("In ServiceImpl >>saveBill");

		return bill2;

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
