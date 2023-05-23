package com.velocity.controller;

import javax.persistence.PostLoad;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.UserInfo;
import com.velocity.service.UserInfoService;

@RestController
public class UserInfoController {
	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(ProductController.class);

	@Autowired
	private UserInfoService userInfoService;

	/*
	 *@Author- Madhurima Gaikwad
	 */
	@PostMapping("/saveUserInfo")
	public ResponseEntity<UserInfo> saveUserInfo(@RequestBody UserInfo userInfo) {
		UserInfo userInfo2 = userInfoService.saveUserInfo(userInfo);
		return ResponseEntity.ok().body(userInfo2);
	}
	
	
	//@Author- Anushka
	
	@PutMapping("updateUserInfo")
	public ResponseEntity<UserInfo> updateUserInfo(@RequestBody UserInfo userInfo)
	{
		UserInfo userInfo2 = userInfoService.updateUserInfo(userInfo);
		
		return ResponseEntity.ok().body(userInfo2);
		
	}

}
