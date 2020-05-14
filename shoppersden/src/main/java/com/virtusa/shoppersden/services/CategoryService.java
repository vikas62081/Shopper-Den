package com.virtusa.shoppersden.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.shoppersden.models.Category;
import com.virtusa.shoppersden.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> getAllCategories()
	{
		return categoryRepository.findAll();
	}
	
	public Category addCategory(Category category)
	{
		return categoryRepository.save(category);
	}
	
	
	public Category updateCategory(Category category)
	{
		return categoryRepository.save(category);
	}
	
	public void deleteCategory(int categoryId)
	{
		// categoryRepository.deleteById(categoryId);
		categoryRepository.delete(categoryId);
	}
	
	public Category findCategoryById(int categoryId)
	{
		return categoryRepository.findOne(categoryId);
	}
	
}
