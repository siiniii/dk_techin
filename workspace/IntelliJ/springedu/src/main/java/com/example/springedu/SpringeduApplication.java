package com.example.springedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication//(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.example.springedu","thymeleaf.exam"})
public class SpringeduApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringeduApplication.class, args);
	}

}
