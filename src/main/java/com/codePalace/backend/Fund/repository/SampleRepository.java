package com.codePalace.backend.Fund.repository;

import com.codePalace.backend.Fund.model.Sample;
import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository  extends DocumentDbRepository<Sample, String> {


}
