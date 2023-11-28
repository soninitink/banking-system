package com.edureka.capstone.transactionservice.controller;

import com.edureka.capstone.transactionservice.entity.Transaction;
import com.edureka.capstone.transactionservice.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @GetMapping("/{id}")
    public Transaction getTransactionById(@PathVariable Long id){
        return transactionService.getTransactionById(id);
    }
    @GetMapping("status/{id}")
    public String getTransactionStatus(@PathVariable Long id){
        return transactionService.getTransactionStatus(id);
    }
    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction){
        return transactionService.createTransaction(transaction);
    }
}
