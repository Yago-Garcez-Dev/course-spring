package com.yagodev.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagodev.coursespring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
