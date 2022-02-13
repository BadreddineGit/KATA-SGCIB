package com.kata.account.controller;

import com.kata.account.dto.AccountDto;
import com.kata.account.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @GetMapping(value = "/{accountNumber}")
    public AccountDto findAccount(@PathVariable("accountNumber") String accountNumber) {
        return accountService
                .find(accountNumber)
                .map(AccountDto::new)
                .orElse(null);
    }
}
