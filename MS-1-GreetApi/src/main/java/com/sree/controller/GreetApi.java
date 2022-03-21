package com.sree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetApi {
	
	@GetMapping("/greet")
	public String sayGreet() {
		String str="Good Morning";
		return str;
	}

}
