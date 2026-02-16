package com.lynda.reglegestion.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lynda.reglegestion.entitees.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{
	//trouve des transaction par compte et par date
	
	List<Transaction> findByNumerocompteAndDatetransactionBetween(String numerocompte,LocalDateTime debut,LocalDateTime fin);
	

}


