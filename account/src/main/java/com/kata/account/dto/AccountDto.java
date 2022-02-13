package com.kata.account.dto;

import com.kata.account.entities.Account;

import java.math.BigDecimal;

public class AccountDto {

    private String accountNumber;
    private BigDecimal balance;

    public AccountDto(Account acc) {
        this.accountNumber = acc.getAccountNumber();
        this.balance = acc.getBalance();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
