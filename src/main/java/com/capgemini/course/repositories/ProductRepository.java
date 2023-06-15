package com.capgemini.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
