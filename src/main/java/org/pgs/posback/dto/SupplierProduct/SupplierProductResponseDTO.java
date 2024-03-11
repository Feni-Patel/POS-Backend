package org.pgs.posback.dto.SupplierProduct;

import lombok.Data;

import java.util.Date;

@Data
public class SupplierProductResponseDTO {

    private Long id;

    private String supplier; // Changed to String

    private String product; // Changed to String

    private Double unitPrice;

    private Date createdAt;

    private Date updatedAt;

}
