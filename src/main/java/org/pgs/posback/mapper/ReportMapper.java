package org.pgs.posback.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.pgs.posback.dto.Report.ReportRequestDTO;
import org.pgs.posback.dto.Report.ReportResponseDTO;
import org.pgs.posback.model.ReportModel;

@Mapper
public interface ReportMapper {
    ReportMapper INSTANCE = Mappers.getMapper(ReportMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    ReportModel reportRequestDTOToReportModel(ReportRequestDTO reportRequestDTO);

    ReportResponseDTO reportModelToReportResponseDTO(ReportModel reportModel);
}
