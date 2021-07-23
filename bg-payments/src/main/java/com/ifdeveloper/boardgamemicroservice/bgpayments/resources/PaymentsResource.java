package com.ifdeveloper.boardgamemicroservice.bgpayments.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifdeveloper.boardgamemicroservice.bgpayments.entities.Payments;
import com.ifdeveloper.boardgamemicroservice.bgpayments.services.PaymentsService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value = "/payments")
public class PaymentsResource {

	@Autowired
	private PaymentsService service;
	
	@HystrixCommand(fallbackMethod = "getPaymentsAlternativa")
	@GetMapping(value = "/{idBoardGame}/days/{days}")
	public ResponseEntity<Payments> getPayments(@PathVariable Long idBoardGame, @PathVariable Integer days) {
		Payments payment = service.getPayments(idBoardGame, days);
		return ResponseEntity.ok(payment);
	}
	
	public ResponseEntity<Payments> getPaymentsAlternativa(Long idBoardGame, Integer days) {
		Payments payment = new Payments("Jogatina Carcassonne", 25.00, days);
		return ResponseEntity.ok(payment);
	}
}
