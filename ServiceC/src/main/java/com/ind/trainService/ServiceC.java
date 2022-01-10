package com.ind.trainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/C")
public class ServiceC {
	//private static final String SERVICE="usercircuitbreaker";

	@Autowired
	FeignServiceBB feignServiceB;
	
	@GetMapping("/print")
	public void printing() {
		System.out.println("I am In C");
		feignServiceB.printing();
//		try {
//			feignServiceB.printing();
//		}catch(Exception ex){
//			System.out.println("HAndled it");
//		}
		
	}
	
	
}
