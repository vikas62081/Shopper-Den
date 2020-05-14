package com.virtusa.shoppersden.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.shoppersden.models.User;

public interface CustomerRepository extends JpaRepository<User, Integer> {

}
