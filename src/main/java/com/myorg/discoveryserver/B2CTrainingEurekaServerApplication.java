package com.myorg.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class B2CTrainingEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(B2CTrainingEurekaServerApplication.class, args);
	}

}
