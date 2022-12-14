package com.axis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggerdemoApplication.class, args);
		System.out.println("hi");
	}

}
