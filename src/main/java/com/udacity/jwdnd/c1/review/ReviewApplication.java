package com.udacity.jwdnd.c1.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

//	@Bean
//	public String message() {
//		System.out.println("message Bean");
//		return "Hello, Spring";
//	}

//	@Bean
//	public String uppercaseMessage(MessageService messageService) {
//		System.out.println("uppercaseMessage Bean");
//		return messageService.upperCase();
//	}
//
//	@Bean
//	public String lowercaseMessage(MessageService messageService) {
//		System.out.println("lowercaseMessage Bean");
//		return messageService.lowerCase();
//	}
}
