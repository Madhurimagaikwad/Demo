package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.repository.CategoryRepository;
import com.velocity.service.CategorySevice;

@Service
public class CategoryServiceImpl implements CategorySevice{
	/*Author-Madhurima*/
	@Autowired
	private CategoryRepository categoryRepository;
	@Override
	public void deleteCategory(int id) {
		categoryRepository.deleteById(id);
		
	}

}
