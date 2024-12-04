package com.example.report;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    // Create or Update Report
    public Report saveOrUpdateReport(Report report) {
        return reportRepository.save(report);
    }

    // Get All Reports
    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

    // Get Report by ID
    public Optional<Report> getReportById(String reportId) {
        return reportRepository.findById(reportId);
    }

    // Delete Report by ID
    public void deleteReport(String reportId) {
        reportRepository.deleteById(reportId);
    }
}
