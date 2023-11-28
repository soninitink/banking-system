package com.edureka.capstone.accountservice.controller;

import com.edureka.capstone.accountservice.entity.Account;
import com.edureka.capstone.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id){
        return accountService.getAccountById(id);
    }
    @PostMapping
    public Account createAccount(@RequestBody Account account){
        return accountService.createAccount(account);
    }
    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable Long id){
        accountService.deleteAccount(id);
    }
    @PutMapping("/{id}")
    public Account updateAccount(@PathVariable Long id, @RequestBody Account account){
        return accountService.updateAccount(id, account);
    }


}
