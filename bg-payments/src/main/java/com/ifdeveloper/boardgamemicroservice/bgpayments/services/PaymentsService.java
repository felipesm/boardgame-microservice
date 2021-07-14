package com.ifdeveloper.boardgamemicroservice.bgpayments.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifdeveloper.boardgamemicroservice.bgpayments.entities.BoardGame;
import com.ifdeveloper.boardgamemicroservice.bgpayments.entities.Payments;
import com.ifdeveloper.boardgamemicroservice.bgpayments.feignclients.BgWorkerFeignClient;

@Service
public class PaymentsService {
	
	@Autowired
	private BgWorkerFeignClient bgWorkerFeignClient;

	public Payments getPayments(long idBoardGame, int rentDays) {
		
		BoardGame boardGame = bgWorkerFeignClient.findById(idBoardGame).getBody();
		return new Payments(boardGame.getName(), boardGame.getRentValue(), rentDays);
	}
}
