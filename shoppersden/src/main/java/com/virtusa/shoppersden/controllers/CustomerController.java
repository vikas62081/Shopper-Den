package com.virtusa.shoppersden.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.shoppersden.models.User;
import com.virtusa.shoppersden.models.Product;
import com.virtusa.shoppersden.services.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/getcustomers")
	public List<User> getAllCustomers()
	{
		return customerService.getAllCustomers();
	}
	
   @PostMapping("/addcustomer/{questionId}")
	public User addCustomer(@RequestBody User user,@PathVariable String questionId)
	{
		return customerService.addCustomer(user, questionId);
	}
}
