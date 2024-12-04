package com.example.report;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reports")
public class Report {

    @Id
    private String reportId;
    private String tickets;
    private String selectRelatedModules;

    // Constructors
    public Report() {}

    public Report(String reportId, String tickets, String selectRelatedModules) {
        this.reportId = reportId;
        this.tickets = tickets;
        this.selectRelatedModules = selectRelatedModules;
    }

    // Getters and Setters
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getTickets() {
        return tickets;
    }

    public void setTickets(String tickets) {
        this.tickets = tickets;
    }

    public String getSelectRelatedModules() {
        return selectRelatedModules;
    }

    public void setSelectRelatedModules(String selectRelatedModules) {
        this.selectRelatedModules = selectRelatedModules;
    }
}
