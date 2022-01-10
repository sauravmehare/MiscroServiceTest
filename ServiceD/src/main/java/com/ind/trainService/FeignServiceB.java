package com.ind.trainService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@FeignClient("ServiceB")
public interface FeignServiceB {
	
	@CircuitBreaker(name="usercircuitbreaker",fallbackMethod = "someMethod")
	@GetMapping("/B/print")
	public void printing();
	
	public default String someMethod(Exception ex) {
		return "Service is down";
	}

}
