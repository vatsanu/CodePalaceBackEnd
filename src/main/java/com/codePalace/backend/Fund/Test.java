package com.codePalace.backend.Fund;

import com.codePalace.backend.Fund.model.Account;
import com.codePalace.backend.Fund.repository.AccountRepository;
import com.microsoft.azure.cosmosdb.FeedOptions;
import org.springframework.beans.factory.annotation.Autowired;

public class Test {

    @Autowired
    AccountRepository accountRepository;

    public void addData(){
        Account account =new Account();
        account.setEmail("test@test1.com");
        account.setPassword("test1");
        accountRepository.save(account);
    }
}
