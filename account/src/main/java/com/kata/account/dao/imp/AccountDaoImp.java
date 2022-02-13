package com.kata.account.dao.imp;

import com.kata.account.dao.IAccountDao;
import com.kata.account.entities.Account;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class AccountDaoImp implements IAccountDao {

    Account acc1 = new Account("ACC1", BigDecimal.ZERO, null);
    Account acc2 = new Account("ACC2", BigDecimal.ZERO, null);

    List<Account> accounts = Arrays.asList(acc1, acc2);

    @Override
    public void updateBalance(String accountNumber, BigDecimal amount) {
        find(accountNumber).ifPresent( acc -> acc.setBalance(acc.getBalance().add(amount)));
    }

    @Override
    public Optional<Account> find(String accountNumber) {
        return accounts.stream()
                .filter(acc -> acc.getAccountNumber().equalsIgnoreCase(accountNumber))
                .findFirst();
    }
}
