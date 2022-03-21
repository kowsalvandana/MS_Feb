package com.sree.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	@Autowired
	private Environment env;
	
	@GetMapping("/wish")
	public String wel() {
		String str="HELLO->GOOD MORNING";
		String port=env.getProperty("local.server.port");
		String f=str+"Application runnig on Port Number:"+port;
		return f;
		
	}

}
