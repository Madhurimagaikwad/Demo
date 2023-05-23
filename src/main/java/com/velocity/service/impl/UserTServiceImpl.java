package com.velocity.service.impl;

import java.util.List;

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
	@Override
	public void deleteUserById(int id) {
		userTRepository.deleteById(id);
	}
	@Override
	public List<UserT> getUser() {
		List<UserT> userT=(List<UserT>) userTRepository.findAll();
		return userT;
	}

}
