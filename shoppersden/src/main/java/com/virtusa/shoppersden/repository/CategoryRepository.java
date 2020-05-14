package com.virtusa.shoppersden.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.shoppersden.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	

}
