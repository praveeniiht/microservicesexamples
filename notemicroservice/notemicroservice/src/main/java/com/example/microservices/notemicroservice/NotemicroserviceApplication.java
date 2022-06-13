package com.example.microservices.notemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.microservices")
@EnableEurekaClient
@EnableFeignClients("com.example.microservices")
@EnableHystrix
public class NotemicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotemicroserviceApplication.class, args);
	}

}
