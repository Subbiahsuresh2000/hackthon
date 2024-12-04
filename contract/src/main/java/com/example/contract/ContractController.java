package com.example.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contracts")
public class ContractController {

    @Autowired
    private ContractService contractService;

    // Create or Update Contract
    @PostMapping
    public ResponseEntity<Contract> createOrUpdateContract(@RequestBody Contract contract) {
        Contract savedContract = contractService.saveOrUpdateContract(contract);
        return new ResponseEntity<>(savedContract, HttpStatus.CREATED);
    }

    // Get All Contracts
    @GetMapping
    public ResponseEntity<List<Contract>> getAllContracts() {
        List<Contract> contracts = contractService.getAllContracts();
        return new ResponseEntity<>(contracts, HttpStatus.OK);
    }

    // Get Contract by ID
    @GetMapping("/{id}")
    public ResponseEntity<Contract> getContractById(@PathVariable("id") String id) {
        Optional<Contract> contract = contractService.getContractById(id);
        return contract.map(c -> new ResponseEntity<>(c, HttpStatus.OK))
                       .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Delete Contract by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContract(@PathVariable("id") String id) {
        contractService.deleteContract(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Update Contract by ID
    @PutMapping("/{id}")
    public ResponseEntity<Contract> updateContract(@PathVariable("id") String id, @RequestBody Contract contract) {
        Optional<Contract> existingContract = contractService.getContractById(id);
        if (existingContract.isPresent()) {
            contract.setContractId(id);
            Contract updatedContract = contractService.saveOrUpdateContract(contract);
            return new ResponseEntity<>(updatedContract, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
