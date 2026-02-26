package com.lynda.reglegestion.dto;

public class ParametreTransaction {

	private String typeTransaction ;
	private String categorieSender;
	private String categorieRecever;
	private String paymentType;
	
	
	public String getTypeTransaction() {
		return typeTransaction;
	}
	public void setTypeTransaction(String typeTransaction) {
		this.typeTransaction = typeTransaction;
	}
	
	public String getCategorieSender() {
		return categorieSender;
	}
	public void setCategorieSender(String categorieSender) {
		this.categorieSender = categorieSender;
	}
	public String getCategorieRecever() {
		return categorieRecever;
	}
	public void setCategorieRecever(String categorieRecever) {
		this.categorieRecever = categorieRecever;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	
}
