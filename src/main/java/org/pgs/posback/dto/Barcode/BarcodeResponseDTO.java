package org.pgs.posback.dto.Barcode;

import lombok.Data;
import org.pgs.posback.model.ProductModel;

import java.util.Date;

@Data
public class BarcodeResponseDTO {

    private Long id;

    private ProductModel product;

    private byte[] barcodeImage;

    private Date createdAt;

    private Date updatedAt;

}
