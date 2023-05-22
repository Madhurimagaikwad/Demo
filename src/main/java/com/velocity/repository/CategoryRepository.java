package com.velocity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Category;
@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
