package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloServiceController {
	
	@GetMapping(path = "/helloworld", produces = "application/json")
	public String helloWorld() {
		return "{\"Hello\": \"World\"}";
	}
	

}
