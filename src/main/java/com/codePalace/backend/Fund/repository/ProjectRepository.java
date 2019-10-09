package com.codePalace.backend.Fund.repository;


import com.codePalace.backend.Fund.model.Project;
import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository  extends DocumentDbRepository<Project, String> {


}
