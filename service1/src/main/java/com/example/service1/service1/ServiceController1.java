package com.example.service1.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class ServiceController1 {

	//@Autowired
	//RestTemplate restTemplate;
	
	@Autowired
	ServiceFeignClient template;
	
	@GetMapping("/getmicro2")
	  public String getMicro2Instance()
	  {
	      //  String url = "http://service2/mservice2/port";
	      //  String port = "Currently hitting instance running on port: " + 
	                      // restTemplate.getForObject(url, String.class);
	        
		return template.getPort();
		//return port;
	  }

}
