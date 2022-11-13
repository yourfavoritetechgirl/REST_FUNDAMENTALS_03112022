package com.simplilearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.model.Greet;

@RestController
public class GreetController {
	
	@GetMapping("/greetMe")
	public Greet greet() {
		Greet greet = new Greet();
		greet.setMessage("Hello Simplilearn");
		greet.setName("Savyata");
		return greet;
	}

}
