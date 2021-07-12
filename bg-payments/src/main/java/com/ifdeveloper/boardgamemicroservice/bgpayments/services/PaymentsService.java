package com.ifdeveloper.boardgamemicroservice.bgpayments.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ifdeveloper.boardgamemicroservice.bgpayments.entities.BoardGame;
import com.ifdeveloper.boardgamemicroservice.bgpayments.entities.Payments;

@Service
public class PaymentsService {
	
	@Value("${bg-worker.host}")
	private String bgWorkerHost;
	
	@Autowired
	private RestTemplate restTemplate;

	public Payments getPayments(long idBoardGame, int rentDays) {
		
		Map<String, String> parametersRequest = new HashMap<>();
		parametersRequest.put("id", String.valueOf(idBoardGame));
		String url = String.format("%s/boardgames/{id}", bgWorkerHost);
		
		BoardGame boardGame = restTemplate.getForObject(url, BoardGame.class, parametersRequest);
		return new Payments(boardGame.getName(), boardGame.getRentValue(), rentDays);
	}
}
