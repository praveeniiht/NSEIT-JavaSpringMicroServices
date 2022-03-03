package com.example.service2.service2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mservice2")
public class ServiceController2 {
	
	@Value("${server.port}")
	  private String port;
	 
	  @GetMapping("/port")
	  public String getPort()
	  {
	        return port;
	  }
}
