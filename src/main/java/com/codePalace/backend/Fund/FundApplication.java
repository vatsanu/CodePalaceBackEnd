package com.codePalace.backend.Fund;

import com.codePalace.backend.Fund.model.Sample;
import com.codePalace.backend.Fund.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class FundApplication  {

    @Autowired
	private  SampleRepository repository;

	public FundApplication(){
	}
	public static void main(String[] args) {
		SpringApplication.run(FundApplication.class, args);
	}



}
