package com.kata.account.service;

import com.kata.account.entities.Transaction;

import java.math.BigDecimal;
import java.util.List;

public interface ITransactionService {

    Transaction addTransaction(String account, BigDecimal amount);

    List<Transaction> findAccountTransactions(String account);
}
