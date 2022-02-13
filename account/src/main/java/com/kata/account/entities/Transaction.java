package com.kata.account.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {

    private Long transactionId;
    private String accountNumber;
    private Date transactionDate;
    private BigDecimal amount;

    public Transaction(Long transactionId, String accountNumber, Date transactionDate, BigDecimal amount) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionDate = transactionDate;
        this.amount = amount;
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
}
