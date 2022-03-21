package com.sree.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sree.client.WishFeignClient;

@RestController
public class Hello {
	@Autowired
	private WishFeignClient client;
	@GetMapping("/hello")
	public String sayHello() {
		String str="Hello";
		String wish=client.invoke();
		String f=str+":"+wish;
		return f;
	}

}
