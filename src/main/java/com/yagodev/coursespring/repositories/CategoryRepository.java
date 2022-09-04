package com.yagodev.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagodev.coursespring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
