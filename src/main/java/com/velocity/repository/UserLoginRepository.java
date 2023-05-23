package com.velocity.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.velocity.model.UserLogin;

@Repository

public interface UserLoginRepository extends JpaRepository<UserLogin, Integer> {

	// How to write native query / SQL query

	@Query(value = "select * from userlogin e where password=?1 ", nativeQuery = true)
	public UserLogin getUserLoginByPassword(String password);

public interface UserLoginRepository extends CrudRepository<UserLogin, Integer> {

}
