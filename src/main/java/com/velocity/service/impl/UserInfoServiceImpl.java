package com.velocity.service.impl;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.UserInfo;
import com.velocity.repository.UserInfoRepository;
import com.velocity.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(ProductServiceImpl.class);

	@Autowired
	private UserInfoRepository userInfoRepository;

	/* Author- Madhurima */
	@Override
	public UserInfo saveUserInfo(UserInfo userInfo) {
		UserInfo userInfo2 = userInfoRepository.save(userInfo);
		logger.info("In RestController >>saveUserInfo");

		return userInfo2;
	}

	/* Author- Anushka */
	@Override
	public UserInfo updateUserInfo(UserInfo userInfo) {
		int usernfoId = userInfo.getId();
		UserInfo userInfo2 = userInfoRepository.findById(usernfoId).get();
		userInfo2.setFullName(userInfo.getFullName());
		userInfo2.setEmail(userInfo.getEmail());
		userInfo2.setPassword(userInfo.getPassword());
		userInfo2.setPrimaryMobile(userInfo.getPrimaryMobile());
		userInfo2.setSecondaryMobile(userInfo.getSecondaryMobile());
		userInfo2.setDob(userInfo.getDob());
		userInfo2.setAge(userInfo.getAge());
		userInfo2.setRefferalInfo(userInfo.getRefferalInfo());
		userInfo2.setRefferalType(userInfo.getRefferalType());
		userInfo2.setAddress(userInfo.getAddress());
		userInfo2.setCity(userInfo.getCity());
		userInfo2.setState(userInfo.getState());
		UserInfo userInfo3 = userInfoRepository.save(userInfo2);
		return userInfo3;

	}
}
