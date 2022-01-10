package com.ind.trainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@RestController
@RequestMapping("/A2")
public class TestA {
	
	@Autowired
	FeignServiceB feignServiceB;
	
	@Autowired
	CircuitBreakerRegistry breakerRegistry;
	
	@CircuitBreaker(name="usercircuitbreaker",fallbackMethod = "someMethod")
	@GetMapping("/print")
	public void printing() {
		try {
			System.out.println("I am In A");
			feignServiceB.printing();
		}catch(Exception ex) {
			System.out.println("Catched");
		}finally {
			System.out.println("I am in finally");
		}
		
	}
	
	public String someMethod(Exception ex) {
		System.out.println("I am not working");
		return "Service is down";
	}
	

}
