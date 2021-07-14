package com.ifdeveloper.boardgamemicroservice.bgpayments.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ifdeveloper.boardgamemicroservice.bgpayments.entities.BoardGame;

@Component
@FeignClient(name = "bg-worker", path = "/boardgames")
public interface BgWorkerFeignClient {

	@GetMapping(value = "/{id}")
	ResponseEntity<BoardGame> findById(@PathVariable Long id);
}
