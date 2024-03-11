package org.pgs.posback.service.impl;

import org.pgs.posback.dto.SupplierProduct.SupplierProductRequestDTO;
import org.pgs.posback.dto.SupplierProduct.SupplierProductResponseDTO;
import org.pgs.posback.mapper.SupplierProductMapper;
import org.pgs.posback.model.SupplierProductModel;
import org.pgs.posback.repository.SupplierProductRepository;
import org.pgs.posback.service.SupplierProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierProductServiceImpl implements SupplierProductService {

    private final SupplierProductRepository supplierProductRepository;

    @Autowired
    public SupplierProductServiceImpl(SupplierProductRepository supplierProductRepository) {
        this.supplierProductRepository = supplierProductRepository;
    }

    @Override
    public List<SupplierProductResponseDTO> getAllSupplierProducts() {
        List<SupplierProductModel> supplierProducts = supplierProductRepository.findAll();
        return supplierProducts.stream()
                .map(SupplierProductMapper.INSTANCE::supplierProductModelToSupplierProductResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SupplierProductResponseDTO getSupplierProductById(Long id) {
        // Implement method to retrieve supplier product by ID from repository
        return null;
    }

    @Override
    public SupplierProductResponseDTO createSupplierProduct(SupplierProductRequestDTO supplierProductRequestDTO) {
        // Implement method to create a new supplier product
        return null;
    }

    @Override
    public SupplierProductResponseDTO updateSupplierProduct(Long id, SupplierProductRequestDTO supplierProductRequestDTO) {
        // Implement method to update an existing supplier product
        return null;
    }

    @Override
    public void deleteSupplierProduct(Long id) {
        // Implement method to delete a supplier product
    }
}
