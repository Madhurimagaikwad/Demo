package com.velocity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Provider;

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Integer> {

}
