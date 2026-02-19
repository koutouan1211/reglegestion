package com.lynda.reglegestion.entitees;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class ParametreRegle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(unique = true)
	private String nomRegle;
	private String operateurRegle;
	private String valeurRegle;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomRegle() {
		return nomRegle;
	}

	public void setNomRegle(String nomRegle) {
		this.nomRegle = nomRegle;
	}

	public String getOperateurRegle() {
		return operateurRegle;
	}

	public void setOperateurRegle(String operateurRegle) {
		this.operateurRegle = operateurRegle;
	}

	public String getValeurRegle() {
		return valeurRegle;
	}

	public void setValeurRegle(String valeurRegle) {
		this.valeurRegle = valeurRegle;
	}

	
}
