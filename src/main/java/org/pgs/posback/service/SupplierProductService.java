package org.pgs.posback.service;

import org.pgs.posback.dto.SupplierProduct.SupplierProductRequestDTO;
import org.pgs.posback.dto.SupplierProduct.SupplierProductResponseDTO;

import java.util.List;

public interface SupplierProductService {

    List<SupplierProductResponseDTO> getAllSupplierProducts();

    SupplierProductResponseDTO getSupplierProductById(Long id);

    SupplierProductResponseDTO createSupplierProduct(SupplierProductRequestDTO supplierProductRequestDTO);

    SupplierProductResponseDTO updateSupplierProduct(Long id, SupplierProductRequestDTO supplierProductRequestDTO);

    void deleteSupplierProduct(Long id);
}
