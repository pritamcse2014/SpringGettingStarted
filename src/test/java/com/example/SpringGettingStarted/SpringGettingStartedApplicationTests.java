package com.example.SpringGettingStarted;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringGettingStartedApplicationTests {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringGettingStartedApplication.class, args);
//		System.out.println("Application Started");
		Alien alien = new Alien();
		alien.code();
//		Alien alien2 = applicationContext.getBean(Alien.class);
//		alien2.code();
//		Alien alien3 = applicationContext.getBean(Alien.class);
//		alien3.code();

		Laptop laptop = applicationContext.getBean(Laptop.class);
		laptop.compile();
	}

}
