package com.ifdeveloper.boardgamemicroservice.bgpayments.entities;

import java.io.Serializable;

public class Payments implements Serializable {

	private static final long serialVersionUID = 1L;

	private String title;
	
	private Double rentValue;
	
	private Integer rentDays;
	
	public Payments() {
		
	}

	public Payments(String title, Double rentValue, Integer rentDays) {
		super();
		this.title = title;
		this.rentValue = rentValue;
		this.rentDays = rentDays;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getRentValue() {
		return rentValue;
	}

	public void setRentValue(Double rentValue) {
		this.rentValue = rentValue;
	}

	public Integer getRentDays() {
		return rentDays;
	}

	public void setRentDays(Integer rentDays) {
		this.rentDays = rentDays;
	}
	
	public double getTotal() {
		return rentDays * rentValue;
	}
	
}
