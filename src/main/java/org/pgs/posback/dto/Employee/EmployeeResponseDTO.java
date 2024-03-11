package org.pgs.posback.dto.Employee;

import lombok.Data;
import org.pgs.posback.model.StoreModel;

import java.util.Date;

@Data
public class EmployeeResponseDTO {

    private Long id;

    private String name;

    private String role;

    private Long contactNumber;

    private Date hireDate;

    private Double salary;

    private StoreModel store;

    private Date createdAt;

    private Date updatedAt;

}
