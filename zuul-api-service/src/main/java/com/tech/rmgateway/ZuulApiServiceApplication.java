package com.tech.rmgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ZuulApiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiServiceApplication.class, args);
		System.out.println("Hello: "+ "RM API GATEWAY Service");
	}

}
