package org.pgs.posback.service.impl;

import org.pgs.posback.dto.Report.ReportRequestDTO;
import org.pgs.posback.dto.Report.ReportResponseDTO;
import org.pgs.posback.mapper.ReportMapper;
import org.pgs.posback.model.ReportModel;
import org.pgs.posback.repository.ReportRepository;
import org.pgs.posback.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportServiceImpl implements ReportService {

    private final ReportRepository reportRepository;

    @Autowired
    public ReportServiceImpl(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @Override
    public ReportResponseDTO createReport(ReportRequestDTO reportRequestDTO) {
        ReportModel reportModel = ReportMapper.INSTANCE.reportRequestDTOToReportModel(reportRequestDTO);
        // Set additional fields if needed
        ReportModel savedReport = reportRepository.save(reportModel);
        return ReportMapper.INSTANCE.reportModelToReportResponseDTO(savedReport);
    }

    @Override
    public ReportResponseDTO updateReport(Long reportId, ReportRequestDTO reportRequestDTO) {
        // Retrieve the report from the repository
        ReportModel reportModel = reportRepository.findById(reportId).orElse(null);
        if (reportModel != null) {
            // Update the report with data from the DTO
            reportModel.setType(reportRequestDTO.getType());
            reportModel.setDate(reportRequestDTO.getDate());
            reportModel.setContent(reportRequestDTO.getContent());
            // Set additional fields if needed
            ReportModel updatedReport = reportRepository.save(reportModel);
            return ReportMapper.INSTANCE.reportModelToReportResponseDTO(updatedReport);
        } else {
            return null; // or throw an exception
        }
    }

    @Override
    public ReportResponseDTO getReportById(Long reportId) {
        // Retrieve the report from the repository
        ReportModel reportModel = reportRepository.findById(reportId).orElse(null);
        if (reportModel != null) {
            return ReportMapper.INSTANCE.reportModelToReportResponseDTO(reportModel);
        } else {
            return null; // or throw an exception
        }
    }

    @Override
    public List<ReportResponseDTO> getAllReports() {
        List<ReportModel> reports = reportRepository.findAll();
        // Convert the list of entities to DTOs
        return reports.stream()
                .map(ReportMapper.INSTANCE::reportModelToReportResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteReport(Long reportId) {
        reportRepository.deleteById(reportId);
    }
}
