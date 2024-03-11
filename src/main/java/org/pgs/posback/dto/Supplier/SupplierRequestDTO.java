package org.pgs.posback.dto.Supplier;

import lombok.Data;

import java.util.Date;

@Data
public class SupplierRequestDTO {

    private Long id;

    private String name;

    private Long contactNumber;

    private Date createdAt;

    private Date updatedAt;

}
