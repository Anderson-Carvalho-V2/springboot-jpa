package com.capgemini.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.capgemini.course.entities.User;
import com.capgemini.course.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner{

	//database seeding
	
	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
	
		User u1 = new User(null, "Maria", "maria@email.com", "99999999", "12345");
		User u2 = new User(null, "Joao", "joao@email.com", "99999999", "12345");
		
		repository.saveAll(Arrays.asList(u1, u2));
		
	}	
}
