package com.virtusa.shoppersden.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.shoppersden.models.UserRole;
import com.virtusa.shoppersden.repository.UserRoleRepository;
@Service
public class UserRoleService {

	@Autowired
	private UserRoleRepository userRoleRepository;
	
	public List<UserRole> getAllUserRole()
	{
		return userRoleRepository.findAll();
	}
	public UserRole getUserByEmail(String email)
	{
		return userRoleRepository.getOne(email);
	}
	
	public UserRole addUserRole(UserRole userRole)
	{
		return userRoleRepository.save(userRole);
	}
	
}
