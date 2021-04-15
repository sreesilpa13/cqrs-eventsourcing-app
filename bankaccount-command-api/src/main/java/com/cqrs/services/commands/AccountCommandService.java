package com.cqrs.services.commands;

import java.util.concurrent.CompletableFuture;

import com.cqrs.dto.commands.AccountCreateDTO;
import com.cqrs.dto.commands.MoneyCreditDTO;
import com.cqrs.dto.commands.MoneyDebitDTO;

public interface AccountCommandService {

    public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}
