package org.pgs.posback.service;

import org.pgs.posback.dto.Product.ProductRequestDTO;
import org.pgs.posback.dto.Product.ProductResponseDTO;

import java.util.List;

public interface ProductService {

    ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO);

    List<ProductResponseDTO> getAllProducts();

    ProductResponseDTO getProductById(Long id);

    ProductResponseDTO updateProduct(ProductRequestDTO productRequestDTO, Long id);

    void deleteProduct(Long id);
}