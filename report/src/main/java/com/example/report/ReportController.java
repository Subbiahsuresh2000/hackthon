package com.example.report;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    // Create or Update Report
    @PostMapping
    public ResponseEntity<Report> createOrUpdateReport(@RequestBody Report report) {
        Report savedReport = reportService.saveOrUpdateReport(report);
        return new ResponseEntity<>(savedReport, HttpStatus.CREATED);
    }

    // Get All Reports
    @GetMapping
    public ResponseEntity<List<Report>> getAllReports() {
        List<Report> reports = reportService.getAllReports();
        return new ResponseEntity<>(reports, HttpStatus.OK);
    }

    // Get Report by ID
    @GetMapping("/{id}")
    public ResponseEntity<Report> getReportById(@PathVariable("id") String id) {
        Optional<Report> report = reportService.getReportById(id);
        return report.map(r -> new ResponseEntity<>(r, HttpStatus.OK))
                     .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Delete Report by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReport(@PathVariable("id") String id) {
        reportService.deleteReport(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Update Report by ID
    @PutMapping("/{id}")
    public ResponseEntity<Report> updateReport(@PathVariable("id") String id, @RequestBody Report report) {
        Optional<Report> existingReport = reportService.getReportById(id);
        if (existingReport.isPresent()) {
            report.setReportId(id);
            Report updatedReport = reportService.saveOrUpdateReport(report);
            return new ResponseEntity<>(updatedReport, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
