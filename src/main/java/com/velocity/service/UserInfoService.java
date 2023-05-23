package com.velocity.service;

import com.velocity.model.UserInfo;

public interface UserInfoService {
	
	public UserInfo saveUserInfo(UserInfo userInfo);

	//Design API to update the user details into database
	
	public UserInfo updateUserInfo(UserInfo userInfo);
}
