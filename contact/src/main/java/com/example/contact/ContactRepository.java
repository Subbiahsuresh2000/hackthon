package com.example.contact;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, String> {
    // You can define custom queries here if needed, for example:
    // List<Contact> findByAccountName(String accountName);
}
