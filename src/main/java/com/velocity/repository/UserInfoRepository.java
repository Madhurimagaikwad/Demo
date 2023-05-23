package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.UserInfo;
import com.velocity.model.UserLogin;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {


	
}
