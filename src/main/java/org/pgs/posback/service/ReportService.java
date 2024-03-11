package org.pgs.posback.service;

import org.pgs.posback.dto.Report.ReportRequestDTO;
import org.pgs.posback.dto.Report.ReportResponseDTO;

import java.util.List;

public interface ReportService {
    ReportResponseDTO createReport(ReportRequestDTO reportRequestDTO);

    ReportResponseDTO updateReport(Long reportId, ReportRequestDTO reportRequestDTO);

    ReportResponseDTO getReportById(Long reportId);

    List<ReportResponseDTO> getAllReports();

    void deleteReport(Long reportId);
}
