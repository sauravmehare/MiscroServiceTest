package com.ind.trainService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

//@FeignClient(name="feignServiceB",url="http://localhost:8082")
@FeignClient("ServiceB")
public interface FeignServiceB {
	public static final String SERVICE= "usercircuitbreaker";

	@CircuitBreaker(name=SERVICE,fallbackMethod = "someMethod")
	@GetMapping("B/print")
	public void printing();
	
	
	public default String someMethod(Exception ex) {
		System.out.println("I am not working");
		return "Service is down";
	}
	
}
