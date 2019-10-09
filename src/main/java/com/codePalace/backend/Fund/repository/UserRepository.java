package com.codePalace.backend.Fund.repository;

import com.codePalace.backend.Fund.model.User;
import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository  extends DocumentDbRepository<User, String> {

  /*  public User findByEmail(String email);

    @Query("SELECT * FROM User u WHERE LOWER(u.email) = LOWER(:email)")
    public User find(@Param("email") String email);*/

   // List<User> findByEmail(String email);

}

