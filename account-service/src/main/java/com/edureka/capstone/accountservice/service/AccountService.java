package com.edureka.capstone.accountservice.service;

import com.edureka.capstone.accountservice.entity.Account;
import com.edureka.capstone.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public Account getAccountById(Long id){
        return accountRepository.findById(id).orElse(null);
    }
    public Account createAccount(Account account){
        return accountRepository.save(account);
    }
    public void deleteAccount(Long id){
        accountRepository.deleteById(id);
    }
    public Account updateAccount(Long id, Account account){
        Account existingAccount = accountRepository.findById(id).orElse(null);
        if(existingAccount != null){
            if(account.getName() != "")
                existingAccount.setName(account.getName());
            existingAccount.setBalance(account.getBalance());
        }
        return accountRepository.save(existingAccount);
    }

}
