package com.kata.account.service;

import com.kata.account.entities.Account;

import java.math.BigDecimal;
import java.util.Optional;

public interface IAccountService {

    void updateBalance(String account, BigDecimal amount);

    Optional<Account> find(String accountNumber);
}
