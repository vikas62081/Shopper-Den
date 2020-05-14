package com.virtusa.shoppersden.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.shoppersden.models.Category;
import com.virtusa.shoppersden.models.Product;
import com.virtusa.shoppersden.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryService categoryService;
	
	public List<Product> getAllProducts()
	{
		return productRepository.findAll();
	}
	
	public Product addProduct(Product product,int categoryId)
	{
		Category category=categoryService.findCategoryById(categoryId);
		product.setCategory(category);
		return productRepository.save(product);
	}
	
	public Product UpdateProduct(Product product,int categoryId)
	{
		Category category=categoryService.findCategoryById(categoryId);
		product.setCategory(category);
		return productRepository.save(product);
	}
	
	public void deleteProduct(int productId)
	{
		 productRepository.delete(productId);
	}
}
