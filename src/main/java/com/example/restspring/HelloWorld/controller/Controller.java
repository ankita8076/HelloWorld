package com.example.restspring.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping ("/hello")
	public String helloPage() {
		
		return "Hello World!" ;
		
		
	}
}
