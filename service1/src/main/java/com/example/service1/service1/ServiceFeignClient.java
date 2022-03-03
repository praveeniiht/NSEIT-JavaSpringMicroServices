package com.example.service1.service1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="SERVICE2")
public interface ServiceFeignClient {

	@GetMapping("mservice2/port")
	  public String getPort();
	
}
