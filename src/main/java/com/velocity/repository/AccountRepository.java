package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}
