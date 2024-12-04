package com.example.report;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReportRepository extends MongoRepository<Report, String> {
    // Custom query methods can be added here, for example:
    // List<Report> findByTickets(String tickets);
}
