package com.example.SpringGettingStarted;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringGettingStartedApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(SpringGettingStartedApplication.class, args);
		System.out.println("Application Started");
	}

}
