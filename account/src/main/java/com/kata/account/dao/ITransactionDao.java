package com.kata.account.dao;

import com.kata.account.entities.Transaction;

import java.math.BigDecimal;
import java.util.List;

public interface ITransactionDao {

    Transaction addTransaction(String account, BigDecimal amount);

    List<Transaction> findAccountTransactions(String accountNumber);
}
