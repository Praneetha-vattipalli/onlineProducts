package com.example.Amazon.products;

import com.example.Amazon.products.Service.ServiceInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;




@SpringBootApplication(scanBasePackages = {"com/example/Amazon/products/Model",
		"com/example/Amazon/products/Service"})
@EnableJpaRepositories(basePackages = {"com/example/Amazon/products/Repository"})
@ComponentScan(basePackages = {"com/example/Amazon/products"})

//@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("done");
	}
	@Bean
	@LoadBalanced

	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
