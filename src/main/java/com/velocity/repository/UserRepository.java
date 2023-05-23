package com.velocity.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.User;
import com.velocity.model.UserLogin;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	
	
}