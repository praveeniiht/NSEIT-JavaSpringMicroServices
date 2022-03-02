package com.postapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.postapp")
public class PostsappApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostsappApplication.class, args);
	}

}
