package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.SpringController;

@SpringBootApplication
public class RestDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDockerApplication.class, args);
		
	}

}