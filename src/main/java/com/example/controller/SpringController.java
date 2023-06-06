package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SpringController {
	
	@GetMapping("/hello")
	public String getData() {
		System.out.println("inside controller");
		return "HELLO DOCKER";
	}

}
