package com.virtusa.shoppersden.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.shoppersden.models.User;
import com.virtusa.shoppersden.models.SecurityQuestion;
import com.virtusa.shoppersden.models.UserRole;
import com.virtusa.shoppersden.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private SecurityQuestionService securityQuestionService;
	@Autowired
	private UserRoleService userRoleService;
	
	public List<User> getAllCustomers()
	{
		return customerRepository.findAll();
	}
	
	public User addCustomer(User user,String questionId)
	{
		SecurityQuestion question=securityQuestionService.findQuestionById(questionId);
		user.setSecurityQuestion(question);
		UserRole userRole=new UserRole();
		userRole.setRole("ROLE_USER");
		//userRole.setCustomer(user);
		userRoleService.addUserRole(userRole);
		return customerRepository.save(user);
	}
}
