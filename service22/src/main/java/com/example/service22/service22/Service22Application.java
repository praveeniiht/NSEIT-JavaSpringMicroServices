package com.example.service22.service22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Service22Application {

	public static void main(String[] args) {
		SpringApplication.run(Service22Application.class, args);
	}

}
