package com.example.contract;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContractRepository extends MongoRepository<Contract, String> {
    // Custom query methods can be added here, for example:
    // List<Contract> findByContractName(String contractName);
}
