package com.edureka.capstone.transactionservice.service;

import com.edureka.capstone.transactionservice.entity.Transaction;
import com.edureka.capstone.transactionservice.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    public Transaction getTransactionById(Long id){
        return transactionRepository.findById(id).orElse(null);
    }
    public String getTransactionStatus(Long id){
        Transaction transaction = transactionRepository.findById(id).orElse(null);
        if(transaction != null)
            return transaction.getStatus().toString();
        return "NOT FOUND";
    }
    public Transaction createTransaction(Transaction transaction){
        return  transactionRepository.save(transaction);
    }
}
