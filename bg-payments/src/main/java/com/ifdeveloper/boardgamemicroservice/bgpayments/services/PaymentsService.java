package com.ifdeveloper.boardgamemicroservice.bgpayments.services;

import org.springframework.stereotype.Service;

import com.ifdeveloper.boardgamemicroservice.bgpayments.entities.Payments;

@Service
public class PaymentsService {

	public Payments getPayments(long idBoardGame, int rentDays) {
		return new Payments("Aluguel Carcassonne", 25.00, rentDays);
	}
}
