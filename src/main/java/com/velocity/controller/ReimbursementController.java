package com.velocity.controller;

import java.util.List;

import javax.persistence.PostLoad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Reimbursement;
import com.velocity.service.ReimbursementService;

@RestController

public class ReimbursementController {

	@Autowired
	private ReimbursementService reimbursementService;
	
	@PostMapping("/saveReimbursement")
	public Reimbursement saveReimbursement(@RequestBody Reimbursement reimbursement) {
		Reimbursement reimbursement2=reimbursementService.saveReimbursement(reimbursement);
		return reimbursement2;
	}

	@PutMapping("/updateReimbursement")
	public ResponseEntity<Reimbursement> updateReimbursement(@RequestBody Reimbursement reimbursement) {
		Reimbursement reimbursement2=reimbursementService.updateReimbursement(reimbursement);
		return ResponseEntity.ok().body(reimbursement2);
	}
	

	@GetMapping("/getReimbursement")
	public List<Reimbursement> getReimbursement() {
		return reimbursementService.getReimbursement();
		
	}
	
	@DeleteMapping("deleteReimbursement/{reimbursementId}")
	public void deleteById(@PathVariable("reimbursementId") int reimbursementId) {
		reimbursementService.deletById(reimbursementId);
	}
}
