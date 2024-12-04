package com.example.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractService {

    @Autowired
    private ContractRepository contractRepository;

    // Create or Update Contract
    public Contract saveOrUpdateContract(Contract contract) {
        return contractRepository.save(contract);
    }

    // Get All Contracts
    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }

    // Get Contract by ID
    public Optional<Contract> getContractById(String contractId) {
        return contractRepository.findById(contractId);
    }

    // Delete Contract by ID
    public void deleteContract(String contractId) {
        contractRepository.deleteById(contractId);
    }
}
