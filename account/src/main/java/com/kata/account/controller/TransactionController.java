package com.kata.account.controller;

import com.kata.account.dto.TransactionDto;
import com.kata.account.entities.Transaction;
import com.kata.account.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private ITransactionService transactionService;

    @GetMapping(value = "/{accountNumber}")
    public List<TransactionDto> findTransactions(@PathVariable("accountNumber") String accountNumber){
        return transactionService.findAccountTransactions(accountNumber).stream()
                .map(TransactionDto::new)
                .collect(Collectors.toList());
    }


    @PostMapping(value = "/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Transaction addTransaction(@RequestBody TransactionDto transaction){
        return transactionService.addTransaction(transaction.getAccountNumber(), transaction.getAmount());
    }
}
