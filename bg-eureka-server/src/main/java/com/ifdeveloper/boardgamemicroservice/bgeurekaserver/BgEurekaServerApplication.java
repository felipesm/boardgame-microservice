package com.ifdeveloper.boardgamemicroservice.bgeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BgEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BgEurekaServerApplication.class, args);
	}

}
