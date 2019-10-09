package com.codePalace.backend.Fund.model;


import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class Account  implements Serializable {
    @Id
    String email;
    String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
