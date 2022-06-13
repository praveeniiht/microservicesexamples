package com.example.microservices.commentmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.microservices")
@EnableEurekaClient
public class CommentmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentmicroserviceApplication.class, args);
	}

}
