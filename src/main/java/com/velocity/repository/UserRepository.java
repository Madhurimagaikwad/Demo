package com.velocity.repository;


import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.velocity.model.User;
import com.velocity.model.UserLogin;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


}

}

