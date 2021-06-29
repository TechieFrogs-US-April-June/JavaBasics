package com.workshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkshopController {
	
	@GetMapping("/welcome")
	public String welcome() {
		
		
		return "Hello World June Workshop!";
	}

}
//200 is for successful response
//500 series is for server side issues
//400 series is for client side issues
//300 series is for redirecting
//100 series is for informational messages
