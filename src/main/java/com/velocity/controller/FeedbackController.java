package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Feedback;
import com.velocity.service.FeedbackService;

@RestController
public class FeedbackController {
	
	//inject feedbackService 
	@Autowired
	private FeedbackService feedbackService;
	
	//Design Restful API to post / save the user feedback
	
	/* Author - Anushka */
	
	@PostMapping("/saveFeedback")
	public ResponseEntity<Feedback> saveFeedback(@RequestBody Feedback feedback) 
	{
		Feedback feedback2 = feedbackService.saveFeedback(feedback);
		return ResponseEntity.ok().body(feedback2);
	}
	
	

}
