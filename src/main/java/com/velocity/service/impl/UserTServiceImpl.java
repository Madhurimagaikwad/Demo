package com.velocity.service.impl;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.UserT;
import com.velocity.repository.UserTRepository;
import com.velocity.service.UserTService;

@Service
public class UserTServiceImpl implements UserTService{

	private static final org.jboss.logging.Logger logger  =LoggerFactory.logger(UserTServiceImpl.class);

	@Autowired
	private UserTRepository userTRepository;
	@Override
	public void deleteById(int id) {
		
		userTRepository.deleteById(id);
		logger.info("In Implementation >>deleteById()");

	}
	
	
	//Design the Restful web service which can store user with only one transaction into database
	
	@Override
	public UserT saveUserTransactionDetails(UserT userT) {
		 UserT userT2= userTRepository.save(userT);
		return userT2;
	}

}
