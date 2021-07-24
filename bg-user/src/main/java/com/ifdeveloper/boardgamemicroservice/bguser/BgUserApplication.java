package com.ifdeveloper.boardgamemicroservice.bguser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BgUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(BgUserApplication.class, args);
	}

}
