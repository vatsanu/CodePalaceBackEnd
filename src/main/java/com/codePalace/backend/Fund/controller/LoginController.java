package com.codePalace.backend.Fund.controller;

import com.codePalace.backend.Fund.Test;
import com.codePalace.backend.Fund.model.Account;
import com.codePalace.backend.Fund.model.Sample;
import com.codePalace.backend.Fund.model.SignInData;
import com.codePalace.backend.Fund.model.User;
import com.codePalace.backend.Fund.repository.AccountRepository;
import com.codePalace.backend.Fund.repository.SampleRepository;
import com.codePalace.backend.Fund.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")
public class LoginController {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value="authenticate",method = RequestMethod.POST)
    public User authenticate(@RequestBody Account account){
/*        Account sampleaccount =new Account();
        sampleaccount.setEmail("test@test1.com");
        sampleaccount.setPassword("test1");
        accountRepository.save(sampleaccount);*/

        Account accounts=accountRepository.findById(account.getEmail()).get();
        if(account.getPassword().equals(accounts.getPassword()))
        {
            List<User> users=new ArrayList<User>();
            userRepository.findAll().forEach(users::add);
            return users.stream().filter(user -> user.getEmail().equals(account.getEmail())).collect(Collectors.toList()).get(0);              // collect the output and convert streams to a List
        }
        return null;
    }

    //@RequestMapping(value="sample")


}
