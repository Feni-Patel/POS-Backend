package org.pgs.posback.service;

import org.pgs.posback.dto.Sale.SaleRequestDTO;
import org.pgs.posback.dto.Sale.SaleResponseDTO;

import java.util.List;

public interface SaleService {

    List<SaleResponseDTO> getAllSales();

    SaleResponseDTO getSaleById(Long id);

    SaleResponseDTO createSale(SaleRequestDTO saleRequestDTO);

    SaleResponseDTO updateSale(Long saleId, SaleRequestDTO saleRequestDTO);

    void deleteSale(Long saleId);
}