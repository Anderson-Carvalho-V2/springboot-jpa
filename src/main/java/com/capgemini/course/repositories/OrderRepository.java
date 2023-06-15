package com.capgemini.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
