package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.service.CategorySevice;

@RestController
public class CategoryController {
	@Autowired
	private CategorySevice categorySevice;
	
	@DeleteMapping("/deletecategory/{id}")
	public void deleteCategoryById(@PathVariable("id") int id) {
		categorySevice.deleteCategory(id);
		

		
	}

}
