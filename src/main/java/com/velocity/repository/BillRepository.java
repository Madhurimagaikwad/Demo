package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.velocity.model.Bill;

public interface BillRepository extends JpaRepository<Bill, Integer>{

}
