package com.ibm.employeeApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class EmployeeServiceAppApplication {

public static Logger logger=LoggerFactory.getLogger(EmployeeServiceAppApplication.class);
	
	@PostConstruct
	public void init(){
		logger.info("Application started")
	}
	
	public static void main(String[] args) {
				logger.info("Application executed")
		SpringApplication.run(EmployeeServiceAppApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
