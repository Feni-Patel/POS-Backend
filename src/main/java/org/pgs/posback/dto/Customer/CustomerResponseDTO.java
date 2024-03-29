package org.pgs.posback.dto.Customer;

import lombok.Data;

import java.util.Date;

@Data
public class CustomerResponseDTO {

    private Long id;

    private String name;

    private Long contactNumber;

    private int loyaltyPoints;

    private Date dateOfBirth;

    private String email;

    private String address;

    private Boolean gender;

    private Date createdAt;

    private Date updatedAt;

}
