package com.example.event;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {
    // Custom query methods can be added here, for example:
    // List<Event> findByStatus(String status);
}
