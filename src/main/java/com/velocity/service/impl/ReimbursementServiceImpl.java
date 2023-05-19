package com.velocity.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Reimbursement;
import com.velocity.repository.ReimbursementRepository;
import com.velocity.service.ReimbursementService;

@Service
public class ReimbursementServiceImpl implements ReimbursementService {

	@Autowired
	private ReimbursementRepository reimbursementRepository;

	@Override
	public Reimbursement saveReimbursement(Reimbursement reimbursement) {

		Reimbursement reimbursement2 = reimbursementRepository.save(reimbursement);
		return reimbursement2;
	}

	@Override
	public List<Reimbursement> getReimbursement() {
		List<Reimbursement> reimbursement2=(List<Reimbursement>)reimbursementRepository.findAll();
	     return reimbursement2;
	
		 
	}

	@Override
	public Reimbursement updateReimbursement(Reimbursement reimbursement) {
		int reimbursementId =reimbursement.getReimbursementId();
		Reimbursement reimbursement2=reimbursementRepository.findById(reimbursementId).get();
		reimbursement2.setAmount(reimbursement.getAmount());
		reimbursement2.setEmplId(reimbursement.getEmplId());
		reimbursement2.setStatus(reimbursement.getStatus());
		reimbursement2.setSubmitDate(reimbursement.getSubmitDate());
		reimbursement2.setType(reimbursement.getType());
		Reimbursement reimbursement3= reimbursementRepository.save(reimbursement2);
		return reimbursement3;
		
	}

	@Override
	public void deletById(int reimbursementId) {
		reimbursementRepository.deleteById(reimbursementId);
		
	}


	

	

	

	

}
