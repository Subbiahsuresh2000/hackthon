package com.example.call;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CallRepository extends MongoRepository<Call, String> {
    // You can define custom queries here if needed, for example:
    // List<Call> findByCallStatus(String status);
}
