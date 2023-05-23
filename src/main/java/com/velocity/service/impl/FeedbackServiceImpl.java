package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Feedback;
import com.velocity.repository.FeedbackRepository;
import com.velocity.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService{

	// inject FeedbackRepository 
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	@Override
	public Feedback getFeedback(Feedback feedback) {
		Feedback feedback2= feedbackRepository.save(feedback);
		return feedback2;
	}

	@Override
	public Feedback saveFeedback(Feedback feedback) {
		Feedback feedback2= feedbackRepository.save(feedback);
		return feedback2;
	}

	

}
