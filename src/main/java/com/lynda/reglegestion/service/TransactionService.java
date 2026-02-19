package com.lynda.reglegestion.service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.lynda.reglegestion.dto.TransactionRequest;
import com.lynda.reglegestion.entitees.ParametreRegle;
import com.lynda.reglegestion.entitees.Transaction;
import com.lynda.reglegestion.repository.ParametreRegleRepository;
import com.lynda.reglegestion.repository.TransactionRepository;

@Service
public class TransactionService {

	private final TransactionRepository transactionRepository;
	private final ParametreRegleRepository regleRepository;

	public TransactionService(TransactionRepository transactionRepository, ParametreRegleRepository regleRepository) {
		this.transactionRepository = transactionRepository;
		this.regleRepository = regleRepository;
	}

	public boolean nombreTransactionParJour(TransactionRequest request) {

		// Recuperer le compte du client
		String numerocompte = request.getNumerocompte();

		// Recuperer la date du jour
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		// Recuperer la nombre de transaction autorisée par jour dans la table de
		// parametres
		ParametreRegle regle = regleRepository.findByNomRegle("MAX_TRANSACTION_JOURNALIER")
				.orElseThrow(() -> new RuntimeException("Cette regle MAX_TRANSACTION_JOURNALIER n'est pas trouvé "));

		Integer maxCount = Integer.valueOf(regle.getValeurRegle());

		// Recuperer la list des transaction du compte pour ce jour
		List<Transaction> listTransactionDuJour = transactionRepository
				.findByNumerocompteAndDatetransaction(numerocompte, today.format(formatter));
		
		Integer countTransactionToday = listTransactionDuJour.size();
		System.out.println(countTransactionToday);
		System.out.println(maxCount);
		System.out.println(today.format(formatter));
		// Comparer le count des transaction avec celui du parametre autorisé
		if(countTransactionToday >= maxCount) {
			return false;
		}
		
		return true;

	}
	
	public String enregistrerTransaction(TransactionRequest request) {
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		Transaction nouvelleTransaction = new Transaction();
		nouvelleTransaction.setDateheuretransaction(request.getTransdate());
		nouvelleTransaction.setDatetransaction(today.format(formatter));
		nouvelleTransaction.setMontants(request.getMontants());
		nouvelleTransaction.setNumerocompte(request.getNumerocompte());
		
		transactionRepository.save(nouvelleTransaction);
		return "OK";
	}


	public boolean espacementTransaction(TransactionRequest request) {
		
		//recuperer les informations de la nouvelle transaction transaction(numerocompte, date et le montant)
		
		// Recuperer la derniere transaction du meme compte
		Optional<Transaction> optLastTransaction = transactionRepository.findTopByNumerocompteOrderByDateheuretransactionDesc(request.getNumerocompte());
		if(optLastTransaction.isEmpty()) {
			return true;
		}
		
		Transaction lastTransaction = optLastTransaction.get();
		
		//Recuperer l'heure et comparer avec la nouvelle transaction
		LocalDateTime derniereHeure = lastTransaction.getDateheuretransaction();
		LocalDateTime maintenant = request.getTransdate();

		long secondes = Duration.between(derniereHeure, maintenant).getSeconds();
		
		System.out.println(secondes);
		
		//Recuperer les informations du parametres
		ParametreRegle regle = regleRepository.findByNomRegle("ESPACEMENT_ENTRE_TRANSACTION")
				.orElseThrow(() -> new RuntimeException("Cette regle ESPACEMENT_ENTRE_TRANSACTION n'est pas trouvé "));

		
		Integer valeurRegle = Integer.valueOf(regle.getValeurRegle());
		Integer nombreSecondes = valeurRegle * 60;
		
		if (secondes < nombreSecondes) { // 300 secondes = 5 minutes
		    return false;
		}

		return true;
	}
	
	
	public boolean delaieTransactionParHeure(TransactionRequest request) {
		
		//recuperer les informations de la transaction(dateheuretransaction,numerocompte)
		
		Optional<Transaction> optTransactions =transactionRepository.findTopByNumerocompteOrderByDateheuretransactionDesc(request.getNumerocompte());
		//si c'est sa premiere fois de faire une transaction alors return(true)
		if(optTransactions.isEmpty()) {
			return true;
		}
			
		Transaction TransactionPrecedente = optTransactions.get();
		
		// on recupere la derniere heure et la nouvelle heure et on effectue une soustraction
		
		LocalDateTime heurePrecedente=TransactionPrecedente.getDateheuretransaction();
		LocalDateTime heureActuelle=request.getTransdate();
		
		Duration difference = Duration.between(heurePrecedente, heureActuelle);
		long heure = difference.toHours();
		
		//recuperer les infos du parametre regles
		
		ParametreRegle regles = regleRepository.findByNomRegle("DELAI_TRANSACTION_PAR_HEURE")
				.orElseThrow(() -> new RuntimeException("Cette règle DELAI_TRANSACTION_PAR_HEURE n'est pas trouvé"));
		
		Integer regleValeur = Integer.valueOf(regles.getValeurRegle());
		
		//on compare le resultat de la soustraction des transaction a celle de la base de donnée 
		//si le resultat est < a celle de la base de donnée alors return(true)
		
		if(heure < regleValeur) {
			return false;
		}
		//sinon return (false)
				return true;
	}
				
				
				public boolean montantCumulerParJour(TransactionRequest request) {
					//recuperer le compte 
					String numeroCompte=request.getNumerocompte();
					
					//recuperer la date du jour
	                LocalDate aujourdHui=LocalDate.now();
	                DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
	                //recuperer le compte et la date du jour
	                List<Transaction> transactionJournalier=transactionRepository.findByNumerocompteAndDatetransaction(numeroCompte, aujourdHui.format(formatter));
					//on faire la somme des montants 
					double sommeTotal=0;
					//utilisation de la boucle for pour calculer la somme des montants
					for(int i=0;i<transactionJournalier.size();i++) {
						Transaction stocke=transactionJournalier.get(i);
						sommeTotal +=stocke.getMontants();
					}
					

					//recupere  les infos du parametre regles
					
					ParametreRegle regleSurMontant= regleRepository.findByNomRegle("PLAFOND_MONTANT_JOURNALIER")
							.orElseThrow(()-> new RuntimeException("Cette règle n'existe PLAFOND_MONTANT_JOURNALIER n'existe pas"));
					
					//on va faire une convertion de type
					Double plafond= Double.valueOf(regleSurMontant.getValeurRegle());
					
					//on compare la somme des montants a celle de la base de donnee
					if(sommeTotal>plafond) {
						
						//si la somme des montants est supperrieur a Z alors
						//return false
						return false;
					}
					
			        //sinon return true
		            return true;
		
	}
	
				
				public boolean montantSupperieurMoyenneHabituelle(TransactionRequest request) {
					
					//recuperer toute les transactions de ce compte  
					List<Transaction> montantHabituelle=transactionRepository.findByNumerocompte(request.getNumerocompte());
					if(montantHabituelle.isEmpty()) {
						return false;
					}
					
					//on recupere les infos du parametre regles 
					ParametreRegle paraRegle=regleRepository.findByNomRegle("COMPARER_DIFFERENT_MONTANTS")
							.orElseThrow(()-> new RuntimeException("Cette règle COMPARER_DIFFERENT_MONTANTS n'existe pas"));
					
					
					//mettre le nouveau montant a jour(recuperer le nouveau montant)
					double nouveauMontant= request.getMontants();
					
					//on compare chaque montants des transactions precedente au montant de la nouvelle transaction
					for(int i=0;i<montantHabituelle.size();i++) {
						Transaction ancien=montantHabituelle.get(i);
						
						//si montant actuel est plus eleve que chaque montant precedente
						if(nouveauMontant<ancien.getMontants()) {
							
							//return false
							return false;
							
						}
						
					}
					
					//return true
					return true;
					
				}
}
