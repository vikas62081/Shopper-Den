package com.virtusa.shoppersden.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.shoppersden.models.Category;
import com.virtusa.shoppersden.services.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/getcategories")
	public List<Category> getAllCategories()
	{
		List<Category> all=categoryService.getAllCategories();
		return all;
	}
	
	@PostMapping("/addcategory")
	public String addCategory(@RequestBody Category category)
	{
		categoryService.addCategory(category);
		return "home";
	}
	
	@PostMapping("/updatecategory")
	public String updateCategory(@RequestBody Category category)
	{
		categoryService.addCategory(category);
		return "home";
	}
	
	@GetMapping("/deletecategory/{categoryId}")
	public void deleteCategory(@PathVariable int categoryId)
	{
		categoryService.deleteCategory(categoryId);
	}
}
