package com.velocity.service.impl;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}