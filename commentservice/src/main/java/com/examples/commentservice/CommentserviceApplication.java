package com.examples.commentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.examples.commentservice")
public class CommentserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentserviceApplication.class, args);
	}

}
