package com.yagodev.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagodev.coursespring.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
}
