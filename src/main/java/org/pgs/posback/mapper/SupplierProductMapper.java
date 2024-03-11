package org.pgs.posback.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.pgs.posback.dto.SupplierProduct.SupplierProductRequestDTO;
import org.pgs.posback.dto.SupplierProduct.SupplierProductResponseDTO;
import org.pgs.posback.model.SupplierProductModel;

@Mapper
public interface SupplierProductMapper {

    SupplierProductMapper INSTANCE = Mappers.getMapper(SupplierProductMapper.class);

    SupplierProductResponseDTO supplierProductModelToSupplierProductResponseDTO(SupplierProductModel supplierProductModel);

    SupplierProductModel supplierProductRequestDTOToSupplierProductModel(SupplierProductRequestDTO supplierProductRequestDTO);
}
