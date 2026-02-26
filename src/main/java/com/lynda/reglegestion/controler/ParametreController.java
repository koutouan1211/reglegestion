package com.lynda.reglegestion.controler;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lynda.reglegestion.dto.ParametreTransaction;
import com.lynda.reglegestion.service.ParametreService;


@RestController
@RequestMapping("/parametre")
public class ParametreController {

	
	private final ParametreService parametreService;
	
	public ParametreController(ParametreService parametreService) {
		
		this.parametreService=parametreService;

	}
	
	//PAIEMENT/TRANSFERT
	@PostMapping("/codeQR")
	public String parametreTransaction(@RequestBody ParametreTransaction dto ) {
		
		return parametreService.transactionCodeQr(dto);
		
	}
	
	@PostMapping("/alias")
	public String parametreTransactions(@RequestBody ParametreTransaction dto ) {
		
		return parametreService.transactionAlias(dto);
		
	}
	
	@PostMapping("/dynamique")
	public String parametresTransactions(@RequestBody ParametreTransaction dto ) {
		return parametreService.transfertCodeQrDynamique(dto);
		
	}
	
	@PostMapping("/banque")
	public String parametresTransactionsbanque(@RequestBody ParametreTransaction dto ) {
		return parametreService.transfertBancaire(dto);
	}
	
	@PostMapping("/canal")
	public String canal(@RequestBody ParametreTransaction dto ) {
		return parametreService.canalUssd(dto);
	}
	
	
	//DEMANDE DE PAIEMENT
	@PostMapping("/site")
	public String paiementmarchand(@RequestBody ParametreTransaction dto ) {
		return parametreService.paiementMarchandSite(dto);
	}
	
	@PostMapping("/ecommerce")
	public String paiementecommerce(@RequestBody ParametreTransaction dto ) {
		return parametreService.paiementECommerce(dto);
	}
		
	@PostMapping("/ecommercelivraison")
	public String paiementecommercelivraison(@RequestBody ParametreTransaction dto ) {
		return parametreService.paiementECommerceLivraison(dto);
	}
	
	@PostMapping("/Particulier")
	public String paiementParticulier(@RequestBody ParametreTransaction dto ) {
		return parametreService.paiementParticulier(dto);
	}
	
	@PostMapping("/autre")
	public String autreDemande(@RequestBody ParametreTransaction dto ) {
		return parametreService.autreDemandePaiement(dto);
	}
	
}
