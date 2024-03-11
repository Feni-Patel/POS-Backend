package org.pgs.posback.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.pgs.posback.dto.Invoice.InvoiceRequestDTO;
import org.pgs.posback.dto.Invoice.InvoiceResponseDTO;
import org.pgs.posback.model.InvoiceModel;

@Mapper
public interface InvoiceMapper {

    InvoiceMapper INSTANCE = Mappers.getMapper(InvoiceMapper.class);


    InvoiceResponseDTO invoiceModelToInvoiceResponseDTO(InvoiceModel invoiceModel);


    InvoiceModel invoiceRequestDTOToInvoiceModel(InvoiceRequestDTO invoiceRequestDTO);
}