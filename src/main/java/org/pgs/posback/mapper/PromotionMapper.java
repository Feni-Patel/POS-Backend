package org.pgs.posback.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.pgs.posback.dto.Promotion.PromotionRequestDTO;
import org.pgs.posback.dto.Promotion.PromotionResponseDTO;
import org.pgs.posback.model.PromotionModel;

@Mapper
public interface PromotionMapper {

    PromotionMapper INSTANCE = Mappers.getMapper(PromotionMapper.class);

    @Mappings({
            @Mapping(target = "id", ignore = true), // id is generated by the database
            @Mapping(target = "createdAt", ignore = true), // CreatedAt is managed by the system
            @Mapping(target = "updatedAt", ignore = true) // UpdatedAt is managed by the system
    })
    PromotionModel promotionRequestDtoToModel(PromotionRequestDTO promotionRequestDTO);

    @Mappings({
            @Mapping(source = "startDate", target = "startDate", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(source = "endDate", target = "endDate", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(source = "createdAt", target = "createdAt", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(source = "updatedAt", target = "updatedAt", dateFormat = "yyyy-MM-dd HH:mm:ss")
            // Map other fields if necessary
    })
    PromotionResponseDTO promotionModelToResponseDto(PromotionModel promotionModel);

    @Mappings({
            // Map fields if necessary
    })
    PromotionModel promotionResponseDtoToModel(PromotionResponseDTO promotionResponseDTO);
}