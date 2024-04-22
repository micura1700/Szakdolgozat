package com.goldentable.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.goldentable.restaurant.Repository")
public class RestaultApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestaultApplication.class, args);
	}

}
