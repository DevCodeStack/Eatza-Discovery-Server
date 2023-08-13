package com.eatza.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationDiscoveryServerApplication.class, args);
	}

}
