package com.velocity.repository;

import org.springframework.data.repository.CrudRepository;

import com.velocity.model.CurrencyConversionBean;

public interface CurrencyConversionRepository extends CrudRepository<CurrencyConversionBean, Long> {

}
