package com.sree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ms1GreetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms1GreetApiApplication.class, args);
	}

}
