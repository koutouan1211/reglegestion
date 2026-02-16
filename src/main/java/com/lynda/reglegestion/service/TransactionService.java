package com.lynda.reglegestion.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lynda.reglegestion.entitees.Transaction;
import com.lynda.reglegestion.repository.TransactionRepository;

@Service
public class TransactionService {

	private final TransactionRepository transactionRepository;
	
	public TransactionService(TransactionRepository transactionRepository) {
		this.transactionRepository=transactionRepository;
	}
	
	public boolean nombreTransactionParJour(String numerocompte) {
		
		//restriction sur le temps
		LocalDate aujourdHui=LocalDate.now();
		LocalDateTime debut = aujourdHui.atStartOfDay();
		LocalDateTime fin = aujourdHui.atTime(23, 59, 59);
		
		List<Transaction> transactions=transactionRepository.findByNumerocompteAndDatetransactionBetween(numerocompte, debut, fin);
		
		int nombreTransaction= transactions.size();
		
		if (nombreTransaction >= 3) {
            return false; 
        } else {
            return true; 
        }
	}
	
}
