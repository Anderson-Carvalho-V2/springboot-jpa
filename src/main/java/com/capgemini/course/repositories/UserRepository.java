package com.capgemini.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
