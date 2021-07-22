package com.ifdeveloper.boardgamemicroservice.bgworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BgWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BgWorkerApplication.class, args);
	}

}
