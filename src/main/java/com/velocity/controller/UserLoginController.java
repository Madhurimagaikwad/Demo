package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.UserLogin;
import com.velocity.service.UserLoginService;

@RestController
public class UserLoginController {

	@Autowired
	private UserLoginService userLoginService;

	/* Author Vishal */
	@PostMapping("/saveUserLogin")
	public ResponseEntity<UserLogin> saveUserLogin(@RequestBody UserLogin userLogin) {
		UserLogin userlog = userLoginService.saveUserLogin(userLogin);
		return ResponseEntity.ok().body(userlog);
	}

}
