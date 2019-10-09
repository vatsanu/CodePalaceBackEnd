package com.codePalace.backend.Fund.repository;

import com.codePalace.backend.Fund.model.Account;
import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository  extends DocumentDbRepository<Account, String> {


}
