package com.wipro.smjeight.repo;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wipro.smjeight.model.Data;

@Repository
public interface DataRepository extends MongoRepository<Data, UUID>{

}
