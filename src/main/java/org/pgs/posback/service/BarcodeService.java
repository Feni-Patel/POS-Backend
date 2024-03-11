package org.pgs.posback.service;

import org.pgs.posback.dto.Barcode.BarcodeRequestDTO;
import org.pgs.posback.dto.Barcode.BarcodeResponseDTO;

import java.util.List;

public interface BarcodeService {

    List<BarcodeResponseDTO> getAllBarcodes();

    BarcodeResponseDTO getBarcodeById(Long id);

    BarcodeResponseDTO createBarcode(BarcodeRequestDTO barcodeRequestDTO);

    BarcodeResponseDTO updateBarcode(Long barcodeId, BarcodeRequestDTO barcodeRequestDTO);

    void deleteBarcode(Long barcodeId);
}