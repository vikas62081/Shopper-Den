package com.virtusa.shoppersden.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.shoppersden.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
