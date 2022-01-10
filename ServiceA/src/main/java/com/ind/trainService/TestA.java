package com.ind.trainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/A")
public class TestA {
	
	@Autowired
	FeignServiceB feignServiceB;
	
	@GetMapping("/print")
	public void printing() {
		System.out.println("I am In A");
		feignServiceB.printing();
	}
	

}
