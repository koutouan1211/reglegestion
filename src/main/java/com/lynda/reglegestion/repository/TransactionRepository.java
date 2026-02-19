package com.lynda.reglegestion.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lynda.reglegestion.entitees.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{
	//trouve des transaction par compte et par date
	
	//List<Transaction> findByNumerocompteAndDatetransactionBetween(String numerocompte,LocalDateTime debut,LocalDateTime fin);
	List<Transaction> findByNumerocompteOrderByDatetransactionDesc(String numerocompte);
	
	List<Transaction> findByNumerocompteAndDatetransaction(String numerocompte, String datetransaction);

	Optional<Transaction> findTopByNumerocompteOrderByDateheuretransactionDesc(String numerocompte);
	
    List<Transaction> findByNumerocompte(String numerocompte);
    
   

}


