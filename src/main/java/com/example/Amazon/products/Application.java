package com.example.Amazon.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Column;

@SpringBootApplication(scanBasePackages = {"com/example/Amazon/products/Model",
		"com/example/Amazon/products/Service"})
@EnableJpaRepositories(basePackages = {"com/example/Amazon/products/Repository"})
@ComponentScan(basePackages = {"com/example/Amazon/products"})

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("done");
	}

}
