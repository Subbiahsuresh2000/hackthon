package com.example.contract;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contracts")
public class Contract {

    @Id
    private String contractId;
    private String contractOwner;
    private String contractName;
    private String contractNumber;
    private String accountName;
    private String productName;
    private String contractStartDate;
    private String contractEndDate;
    private String supportPlan;
    private String description;
    private String contractExpiryNotification;

    // Constructors
    public Contract() {}

    public Contract(String contractId, String contractOwner, String contractName, String contractNumber, 
                    String accountName, String productName, String contractStartDate, String contractEndDate, 
                    String supportPlan, String description, String contractExpiryNotification) {
        this.contractId = contractId;
        this.contractOwner = contractOwner;
        this.contractName = contractName;
        this.contractNumber = contractNumber;
        this.accountName = accountName;
        this.productName = productName;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.supportPlan = supportPlan;
        this.description = description;
        this.contractExpiryNotification = contractExpiryNotification;
    }

    // Getters and Setters
    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractOwner() {
        return contractOwner;
    }

    public void setContractOwner(String contractOwner) {
        this.contractOwner = contractOwner;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getSupportPlan() {
        return supportPlan;
    }

    public void setSupportPlan(String supportPlan) {
        this.supportPlan = supportPlan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContractExpiryNotification() {
        return contractExpiryNotification;
    }

    public void setContractExpiryNotification(String contractExpiryNotification) {
        this.contractExpiryNotification = contractExpiryNotification;
    }
}
