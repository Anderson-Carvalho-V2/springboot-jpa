package com.capgemini.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.capgemini.course.entities.Order;
import com.capgemini.course.entities.User;
import com.capgemini.course.entities.enums.OrderStatus;
import com.capgemini.course.repositories.OrderRepository;
import com.capgemini.course.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {

	// database seeding

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria", "maria@email.com", "99999999", "12345");
		User u2 = new User(null, "Joao", "joao@email.com", "99999999", "12345");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-06-21T03:42:10Z"), OrderStatus.WAITING_PAIMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-06-22T15:22:22Z"), OrderStatus.WAITING_PAIMENT, u1);

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));

	}
}
