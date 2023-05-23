package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.UserLogin;
import com.velocity.service.FeedbackService;
import com.velocity.service.UserLoginService;

@RestController
public class UserLoginBookingFeedbackControlller {

	// inject service
	@Autowired
	private UserLoginService userLoginService;

	

	@GetMapping("/getUserLoginByPassword/{password}")
	public ResponseEntity<UserLogin> getUserLoginByPassword(@PathVariable("password") String password) {
		// calling the method here
		UserLogin userLogin = userLoginService.getUserLoginByPassword(password);
		return ResponseEntity.ok().body(userLogin);

	}
}
