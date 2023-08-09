package com.ibm.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscoveryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryAppApplication.class, args);
	}

}
