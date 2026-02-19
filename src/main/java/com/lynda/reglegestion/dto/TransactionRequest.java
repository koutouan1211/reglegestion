package com.lynda.reglegestion.dto;

import java.time.LocalDateTime;

public class TransactionRequest {

	private String numerocompte;
	private Double montants;
	private LocalDateTime transdate;

	public String getNumerocompte() {
		return numerocompte;
	}

	public void setNumerocompte(String numerocompte) {
		this.numerocompte = numerocompte;
	}

	public Double getMontants() {
		return montants;
	}

	public void setMontants(Double montants) {
		this.montants = montants;
	}

	public LocalDateTime getTransdate() {
		return transdate;
	}

	public void setTransdate(LocalDateTime transdate) {
		this.transdate = transdate;
	}
	
	

}
