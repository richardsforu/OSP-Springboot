package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSereverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSereverApplication.class, args);
	}

}
