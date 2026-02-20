package com.lynda.reglegestion.controler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lynda.reglegestion.dto.TransactionRequest;
import com.lynda.reglegestion.repository.TransactionRepository;
import com.lynda.reglegestion.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionRepository transactionRepository;
	private final TransactionService transactionService;

	// construction
	public TransactionController(TransactionService transactionService, TransactionRepository transactionRepository) {
		this.transactionService = transactionService;
		this.transactionRepository = transactionRepository;
	}

	@PostMapping
	public String transactionEffectuer(@RequestBody TransactionRequest request) {

		boolean autorise = transactionService.nombreTransactionParJour(request);

		String numeroCompte = request.getNumerocompte();

		if (!autorise) {
			return "Nombre maximum de transactions atteint";
		}
		
		//Verifier l'espacement entre deux transaction
		boolean espacement = transactionService.espacementTransaction(request);
		
		if(!espacement) {
		return "Votre transaction est encore tres recente";
		}

		
		//verification entre les heures de deux transactions
				boolean duree = transactionService.delaieTransactionParHeure(request);
				
				
				if(!duree) {
					return " Transaction recente";
				}
				
		//verification du soldes plafonner
				boolean soldePlafonner =transactionService.montantCumulerParJour(request);
				if(!soldePlafonner) {
					return "Vous avez atteint le plafond des montants fixé par jours";
				}
				
		//verifiacation et des comparaison des montants habituelles
				boolean comparaison = transactionService.montantSupperieurMoyenneHabituelle(request);
				if(comparaison) {
					return"Alerte,Nous avons des doutes sur votre transaction";
				}
				
	  //verification du montant maximal fixé
				boolean montantMaximal=transactionService.montantMaximun(request);
				if(!montantMaximal) {
					return "Montant maximal atteint";
				}
	//verification des echecs
				boolean echecConsecutif = transactionService.compteBloquerTemporairaiment(request);	
				if(!echecConsecutif) {
					return "Echec de la transaction";
				}
				
				this.transactionService.enregistrerTransaction(request);
		
		return "Transaction effectuée";
	
		
	}

	
}
