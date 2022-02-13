package com.kata.account.dto;

import com.kata.account.entities.Transaction;

import java.math.BigDecimal;
import java.util.Date;

public class TransactionDto {

    private Long transactionId;
    private String accountNumber;
    private Date transactionDate;
    private BigDecimal amount;
    private BigDecimal balance;

    public TransactionDto(Transaction tr) {
        this.transactionId = tr.getTransactionId();
        this.accountNumber = tr.getAccountNumber();
        this.transactionDate = tr.getTransactionDate();
        this.amount = tr.getAmount();
    }

    public TransactionDto() {
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
