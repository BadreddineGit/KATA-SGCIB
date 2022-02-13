package com.kata.account.dao;

import com.kata.account.entities.Account;

import java.math.BigDecimal;
import java.util.Optional;

public interface IAccountDao {

    void updateBalance(String account, BigDecimal amount);

    Optional<Account> find(String accountNumber);
}
