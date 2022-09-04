package com.yagodev.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagodev.coursespring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
