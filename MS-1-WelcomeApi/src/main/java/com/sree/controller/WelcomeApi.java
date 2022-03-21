package com.sree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sree.client.GreetFeignClient;

@RestController
public class WelcomeApi {
	
	@Autowired
	private GreetFeignClient greet;
	@GetMapping("/wel")
	public String welcome() {
		String str="WELCOME";
		String resp=greet.invoke();
		String finalRes=resp+":"+str;
		return finalRes;
	}

}
