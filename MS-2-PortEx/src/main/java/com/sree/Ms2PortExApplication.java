package com.sree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ms2PortExApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms2PortExApplication.class, args);
	}

}
