package org.pgs.posback.dto.Store;

import lombok.Data;

import java.util.Date;

@Data
public class StoreRequestDTO {

    private Long id;

    private String name;

    private String address;

    private Long contactNumber;

    private String openingHours;

    private Date createdAt;

    private Date updatedAt;
}
