package com.velocity.service;

import com.velocity.model.Feedback;

public interface FeedbackService {
	
	public Feedback getFeedback(Feedback feedback);
	
	//Design Restful API to post / save the user feedback
	
	public Feedback saveFeedback(Feedback feedback);
	

}
