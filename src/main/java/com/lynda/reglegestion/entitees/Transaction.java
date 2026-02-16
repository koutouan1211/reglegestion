package com.lynda.reglegestion.entitees;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer id;
	private LocalDateTime datetransaction;
	private Double montants;
	private String numerocompte;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDatetransaction() {
		return datetransaction;
	}
	public void setDatetransaction(LocalDateTime datetransaction) {
		this.datetransaction = datetransaction;
	}
	public Double getMontants() {
		return montants;
	}
	public void setMontants(Double montants) {
		this.montants = montants;
	}
	public String getNumerocompte() {
		return numerocompte;
	}
	public void setNumerocompte(String numerocompte) {
		this.numerocompte = numerocompte;
	}
	
	
	
	
	
	
}
