package com.velocity.service.impl;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Bill;
import com.velocity.repository.BillRepository;
import com.velocity.service.BillService;

@Service
public class BillServiceImpl implements BillService {
	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(BillServiceImpl.class);

	@Autowired
	private BillRepository billRepository;

	@Override
	public Bill saveBill(Bill bill) {
		Bill bill2 = billRepository.save(bill);
		logger.info("In ServiceImpl >>saveBill");

		return bill2;
	}

}
