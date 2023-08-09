package com.ibm.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/gateway")
public class Apicontroller {
	
	@GetMapping("/health")
	public String status() {
		return "ApiGateway is healthy!";
		
	}

}
