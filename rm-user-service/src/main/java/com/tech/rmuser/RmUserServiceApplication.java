package com.tech.rmuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RmUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RmUserServiceApplication.class, args);
		System.out.println("Hello: "+ "RM User Service");
	}

}
