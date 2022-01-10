package com.ind.trainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/D")
public class ServiceD {
	
	@Autowired
	FeignServiceB feignServiceB;
	
	@GetMapping("/print")
	public void printing() {
		System.out.println("I am In C");
		try {
			feignServiceB.printing();
		}catch(Exception ex){
			System.out.println("HAndled it");
		}
		
	}

}
