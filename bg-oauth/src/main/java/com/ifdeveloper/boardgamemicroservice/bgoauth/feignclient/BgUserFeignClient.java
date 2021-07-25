package com.ifdeveloper.boardgamemicroservice.bgoauth.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ifdeveloper.boardgamemicroservice.bgoauth.entities.User;

@Component
@FeignClient(name = "bg-user", path = "/users")
public interface BgUserFeignClient {

	@GetMapping(value = "/email")
	ResponseEntity<User> findByEmail(@RequestParam String email);
}
