package com.lynda.reglegestion.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.lynda.reglegestion.dto.ParametreTransaction;



public class ParametreServiceTest {

	ParametreService Service= new ParametreService();
	
	@Test
	void testPaiement() {
	//ON CREE LE REQUEST/on saisir les valeur a comparer
		ParametreTransaction request=new ParametreTransaction();
		request.setTypeTransaction("demande de paiement");
		request.setCategorieSender("P");
		request.setCategorieRecever("");
		request.setPaymentType("marchand sur site");
		
		//on appele la methode
		String resultat=Service.channelRule(request);
		
		//on verifie le resultat
		assertEquals("Champ Vide",resultat);
	}
	
}
