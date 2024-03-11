package org.pgs.posback.controller;

import org.pgs.posback.dto.Report.ReportRequestDTO;
import org.pgs.posback.dto.Report.ReportResponseDTO;
import org.pgs.posback.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportController {

    private final ReportService reportService;

    @Autowired
    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ReportResponseDTO>> getAllReports() {
        List<ReportResponseDTO> reports = reportService.getAllReports();
        return new ResponseEntity<>(reports, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReportResponseDTO> getReportById(@PathVariable("id") Long id) {
        ReportResponseDTO report = reportService.getReportById(id);
        return report != null ? new ResponseEntity<>(report, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<ReportResponseDTO> createReport(@RequestBody ReportRequestDTO reportRequestDTO) {
        ReportResponseDTO createdReport = reportService.createReport(reportRequestDTO);
        return new ResponseEntity<>(createdReport, HttpStatus.CREATED);
    }

    @PutMapping("/{reportId}")
    public ResponseEntity<ReportResponseDTO> updateReport(@PathVariable("reportId") Long reportId, @RequestBody ReportRequestDTO reportRequestDTO) {
        ReportResponseDTO updatedReport = reportService.updateReport(reportId, reportRequestDTO);
        return updatedReport != null ? new ResponseEntity<>(updatedReport, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{idr}")
    public ResponseEntity<HttpStatus> deleteReport(@PathVariable("idr") Long idr) {
        reportService.deleteReport(idr);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
