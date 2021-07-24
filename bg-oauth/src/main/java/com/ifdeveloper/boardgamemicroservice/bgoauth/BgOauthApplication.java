package com.ifdeveloper.boardgamemicroservice.bgoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BgOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(BgOauthApplication.class, args);
	}

}
