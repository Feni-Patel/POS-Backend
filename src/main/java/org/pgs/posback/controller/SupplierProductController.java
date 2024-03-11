package org.pgs.posback.controller;

import org.pgs.posback.dto.SupplierProduct.SupplierProductRequestDTO;
import org.pgs.posback.dto.SupplierProduct.SupplierProductResponseDTO;
import org.pgs.posback.service.SupplierProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier-products")
public class SupplierProductController {

    private final SupplierProductService supplierProductService;

    @Autowired
    public SupplierProductController(SupplierProductService supplierProductService) {
        this.supplierProductService = supplierProductService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<SupplierProductResponseDTO>> getAllSupplierProducts() {
        List<SupplierProductResponseDTO> supplierProducts = supplierProductService.getAllSupplierProducts();
        return ResponseEntity.ok(supplierProducts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupplierProductResponseDTO> getSupplierProductById(@PathVariable Long id) {
        SupplierProductResponseDTO supplierProduct = supplierProductService.getSupplierProductById(id);
        return supplierProduct != null ? ResponseEntity.ok(supplierProduct) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<SupplierProductResponseDTO> createSupplierProduct(@RequestBody SupplierProductRequestDTO supplierProductRequestDTO) {
        SupplierProductResponseDTO createdSupplierProduct = supplierProductService.createSupplierProduct(supplierProductRequestDTO);
        return new ResponseEntity<>(createdSupplierProduct, HttpStatus.CREATED);
    }

    @PutMapping("/{supplierproductid}")
    public ResponseEntity<SupplierProductResponseDTO> updateSupplierProduct(@PathVariable Long supplierproductid, @RequestBody SupplierProductRequestDTO supplierProductRequestDTO) {
        SupplierProductResponseDTO updatedSupplierProduct = supplierProductService.updateSupplierProduct(supplierproductid, supplierProductRequestDTO);
        return updatedSupplierProduct != null ? ResponseEntity.ok(updatedSupplierProduct) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{idsp}")
    public ResponseEntity<Void> deleteSupplierProduct(@PathVariable Long idsp) {
        supplierProductService.deleteSupplierProduct(idsp);
        return ResponseEntity.noContent().build();
    }
}
