package com.lynda.reglegestion.controler;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lynda.reglegestion.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

	private final TransactionService transactionService;
	
	//construction
	public TransactionController(TransactionService transactionService) {
		this.transactionService=transactionService;
	}
	
	@PostMapping("/{numerocompte}")
	
	public String TransactionEffectuer(@PathVariable String numerocompte) {
		boolean autorise=transactionService.nombreTransactionParJour(numerocompte);
		
		if (autorise) {
            return "Transaction autorisée";
        } else {
            return "Nombre maximum de transactions atteint";
        }
	}
}
