package com.example.rate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.example.rate.Service","com.example.rate.Entity"})
@EnableJpaRepositories(basePackages = {"com/example/rate/Repository"})
@ComponentScan(basePackages = {"com/example/rate"})
//@EnableSwagger2
public class RateApplication {

	public static void main(String[] args) {
		SpringApplication.run(RateApplication.class, args);
	}

}
