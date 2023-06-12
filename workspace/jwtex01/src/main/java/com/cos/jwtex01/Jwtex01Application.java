package com.cos.jwtex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.cos.jwtex01.repository"})
@EntityScan(basePackages = {"com.cos.jwtex01.model"})
public class Jwtex01Application {
	@Bean
	BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}


	public static void main(String[] args) {
		SpringApplication.run(Jwtex01Application.class, args);
	}

}
