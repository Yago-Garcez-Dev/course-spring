package com.yagodev.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagodev.coursespring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
