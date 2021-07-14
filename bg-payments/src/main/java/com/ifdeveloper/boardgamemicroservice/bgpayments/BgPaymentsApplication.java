package com.ifdeveloper.boardgamemicroservice.bgpayments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BgPaymentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BgPaymentsApplication.class, args);
	}

}
