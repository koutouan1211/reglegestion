package com.lynda.reglegestion.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.lynda.reglegestion.dto.ParametreTransaction;



public class ParametreServiceTest {

	ParametreService Service= new ParametreService();
	
	private ParametreTransaction createRequest(String type,String sender,String recever,String paiement) {
		
		
		ParametreTransaction request = new ParametreTransaction();
		request.setTypeTransaction(type);
		request.setCategorieSender(sender);
		request.setCategorieRecever(recever);
		request.setPaymentType(paiement);
		return request;
	}
	
	@Test
	void testChampVide() {
		ParametreTransaction request=createRequest("paiement","P","","QR");
		String resultat=Service.channelRule(request);
		assertEquals("Champ Vide",resultat);
	}
	
	@Test
	void testParQR_P_P() {
		ParametreTransaction request = createRequest("paiement","P","P","QR");
		String resultat=Service.channelRule(request);
		assertEquals("731",resultat);
	}
	
	@Test
	void testParAlias_P_P() {
		ParametreTransaction request = createRequest("paiement","P","P","OTHER_ACCOUNT");
		String resultat=Service.channelRule(request);
		assertEquals("633",resultat);
	}
	
	@Test
	void testParQR_C_P() {
		ParametreTransaction request = createRequest("paiement","C","P","OTHER_ACCOUNT");
		String resultat=Service.channelRule(request);
		assertEquals("633",resultat);
	}
	
	@Test
	void test_Impossible() {
		ParametreTransaction request= createRequest("paiement","C","P","OTHER_ACCOUN");
		String resultat=Service.channelRule(request);
		assertEquals("IMPOSSIBLE",resultat);
	}
	
	@Test
     void testDemandePaiementDeParticulier() {
		ParametreTransaction request= createRequest("demande de paiement","P","P","provenant d'un particulier");
		String resultat=Service.channelRule(request);
		assertEquals("631",resultat);
	}
	
	@Test
	void testDemandePaiementDeParticulierRejeter() {
		ParametreTransaction request= createRequest("demande de paiement","P","P","commerçant");
		String resultat=Service.channelRule(request);
		assertEquals("IMPOSSIBLE",resultat);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@Test
	//void testPaiement() {
	//ON CREE LE REQUEST/on saisir les valeur a comparer
		//ParametreTransaction request=new ParametreTransaction();
		//request.setTypeTransaction("demande de paiement");
		//request.setCategorieSender("P");
		//request.setCategorieRecever("");
		//request.setPaymentType("marchand sur site");
		
		//on appele la methode
		//String resultat=Service.channelRule(request);
		
		//on verifie le resultat
		//assertEquals("Champ Vide",resultat);
	//}
	
	//@Test
	//void testPaiementAlias() {
	//	ParametreTransaction request=new ParametreTransaction();
		//request.setTypeTransaction("paiement");
		//request.setCategorieSender("P");
		//request.setCategorieRecever("");
		//request.setPaymentType("IBAN");
		
		//on appele la methode
		//String resultat=Service.channelRule(request);
		
		//on verifie le resultat
		//assertEquals("Champ Vide",resultat);
	//}
	
}
