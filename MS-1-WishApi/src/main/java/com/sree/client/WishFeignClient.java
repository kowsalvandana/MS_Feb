package com.sree.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELCOME-API")
public interface WishFeignClient {
	@GetMapping("/wel")
	public String invoke();

}
