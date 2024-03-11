package org.pgs.posback.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.pgs.posback.dto.Sale.SaleRequestDTO;
import org.pgs.posback.dto.Sale.SaleResponseDTO;
import org.pgs.posback.model.SaleModel;

@Mapper
public interface SaleMapper {

    SaleMapper INSTANCE = Mappers.getMapper(SaleMapper.class);

    SaleResponseDTO saleModelToSaleResponseDTO(SaleModel saleModel);

    SaleModel saleRequestDTOToSaleModel(SaleRequestDTO saleRequestDTO);
}