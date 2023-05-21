package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.UserAddress;

@Repository
public interface UserAddressRepository extends JpaRepository<UserAddress, Integer>{

}
