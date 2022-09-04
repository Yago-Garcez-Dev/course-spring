package com.yagodev.coursespring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yagodev.coursespring.entities.Person;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<Person> findAll() {
		Person u = new Person(1L, "Maria", "maria@gmail.com", "99999999", "123464");
		return ResponseEntity.ok().body(u);
	}
}
