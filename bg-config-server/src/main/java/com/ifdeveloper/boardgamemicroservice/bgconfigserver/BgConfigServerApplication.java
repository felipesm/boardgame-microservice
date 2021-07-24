package com.ifdeveloper.boardgamemicroservice.bgconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BgConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BgConfigServerApplication.class, args);
	}

}
