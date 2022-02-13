package com.kata.account.service.imp;

import com.kata.account.dao.IAccountDao;
import com.kata.account.entities.Account;
import com.kata.account.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class AccountServiceImp implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public void updateBalance(String account, BigDecimal amount) {
        accountDao.updateBalance(account, amount);
    }

    @Override
    public Optional<Account> find(String accountNumber) {
        return accountDao.find(accountNumber);
    }
}
