package com.velocity.service.impl;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.UserInfo;
import com.velocity.repository.UserInfoRepository;
import com.velocity.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	private static final org.jboss.logging.Logger logger  =LoggerFactory.logger(ProductServiceImpl.class);
	
	@Autowired
	private UserInfoRepository userInfoRepository;
	@Override
	public UserInfo saveUserInfo(UserInfo userInfo) {
		UserInfo userInfo2=userInfoRepository.save(userInfo);
		logger.info("In RestController >>saveUserInfo");

		return userInfo2;
	}

}
