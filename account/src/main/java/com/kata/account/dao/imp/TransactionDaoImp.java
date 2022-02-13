package com.kata.account.dao.imp;

import com.kata.account.dao.ITransactionDao;
import com.kata.account.entities.Transaction;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TransactionDaoImp implements ITransactionDao {

    List<Transaction> transactions = new ArrayList<>();
    Long id = 1L;

    @Override
    public Transaction addTransaction(String accountNumber, BigDecimal amount) {
        Transaction tr = new Transaction(id++, accountNumber, new Date(), amount);
        transactions.add(tr);
        return tr;
    }

    @Override
    public List<Transaction> findAccountTransactions(String accountNumber) {
        return transactions.stream()
                .filter(tr -> tr.getAccountNumber().equalsIgnoreCase(accountNumber))
                .collect(Collectors.toList());
    }

}
