package com.kata.account.service.imp;

import com.kata.account.dao.ITransactionDao;
import com.kata.account.entities.Transaction;
import com.kata.account.service.IAccountService;
import com.kata.account.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TransactionServiceImp implements ITransactionService {

    @Autowired
    private ITransactionDao transactionDao;

    @Autowired
    private IAccountService accountService;

    @Override
    public Transaction addTransaction(String accountNumber, BigDecimal amount) {
        Transaction tr = transactionDao.addTransaction(accountNumber, amount);
        accountService.updateBalance(accountNumber, amount);
        return tr;
    }

    @Override
    public List<Transaction> findAccountTransactions(String accountNumber) {
        return transactionDao.findAccountTransactions(accountNumber);
    }
}
