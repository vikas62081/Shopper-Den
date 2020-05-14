package com.virtusa.shoppersden.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.shoppersden.models.Product;
import com.virtusa.shoppersden.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/getproducts")
	public List<Product> getAllProducts()
	{
		return productService.getAllProducts();
	}
	
	@PostMapping("/addproduct/{Id}")
	public Product addProduct(@RequestBody Product product,@PathVariable String Id)
	{
		int categoryId=Integer.parseInt(Id);
		return productService.addProduct(product,categoryId);
	}
	
	@PostMapping("/updateproduct/{categoryId}")
	public Product updateProduct(@RequestBody Product product,@RequestParam String categoryInfo)
	{
		int categoryId=Integer.parseInt(categoryInfo);
		return productService.addProduct(product,categoryId);
	}
	
	@PostMapping("/deleteproduct/{productId}")
	public void deleteProduct(@PathVariable int productId)
	{
		productService.deleteProduct(productId);
	}

}
