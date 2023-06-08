package com.tech.rm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RmEurekaServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RmEurekaServerApplication.class, args);
		System.out.println("Hello: "+ "RM Eureka Server");
	}

}
