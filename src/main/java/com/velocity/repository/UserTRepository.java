package com.velocity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Transaction;
import com.velocity.model.UserT;

@Repository
public interface UserTRepository extends CrudRepository<UserT, Integer> {

	
}