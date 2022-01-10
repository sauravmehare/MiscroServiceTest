package com.ind.trainService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@FeignClient("ServiceB")
public interface FeignServiceBB {

	@CircuitBreaker(name="usercircuitbreaker",fallbackMethod = "someMethod")
	@GetMapping("B/print")
	public void printing();
	
	public default String someMethod(Exception ex) {
		System.out.println("I am not working");
		return "Service is down";
	}
	
	

}
