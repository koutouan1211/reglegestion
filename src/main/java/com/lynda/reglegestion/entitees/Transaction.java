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
	private LocalDateTime dateheuretransaction;
	private String datetransaction;
	private Double montants;
	private String numerocompte;
	// stocke le nombre d'echec
	private int nombreEchec;
	//return true or false
	private boolean bloque;

	
	public int getNombreEchec() {
		return nombreEchec;
	}
	public void setNombreEchec(int nombreEchec) {
		this.nombreEchec = nombreEchec;
	}
	public boolean isBloque() {
		return bloque;
	}
	public void setBloque(boolean bloque) {
		this.bloque = bloque;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public LocalDateTime getDateheuretransaction() {
		return dateheuretransaction;
	}
	public void setDateheuretransaction(LocalDateTime dateheuretransaction) {
		this.dateheuretransaction = dateheuretransaction;
	}
	public String getDatetransaction() {
		return datetransaction;
	}
	public void setDatetransaction(String datetransaction) {
		this.datetransaction = datetransaction;
	}

		
}
