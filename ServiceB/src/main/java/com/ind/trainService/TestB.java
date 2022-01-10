package com.ind.trainService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/B")
public class TestB {
	
	@GetMapping("/print")
	public void printing() {
		System.out.println("I am printing from Service B");
	}

}
