package com.tech.rminfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients 
public class RmInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RmInfoServiceApplication.class, args);
		System.out.println("Hello: "+ "RM Info Service");
	}

}
