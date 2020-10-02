package com.policyservice.ms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.policyservice.ms.model.Policy;

public interface IPolicyRepository extends MongoRepository<Policy, String>{

}
