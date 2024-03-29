package org.pgs.posback.dto.Manager;

import lombok.Data;
import org.pgs.posback.model.AccountModel;
import org.pgs.posback.model.AdminModel;
import org.pgs.posback.model.StoreModel;

import java.util.Date;

@Data
public class ManagerRequestDTO {

    private Long id;

    private AccountModel account;

    private String name;

    private String role;

    private AdminModel admin;

    private StoreModel store;

    private Date createdAt;

    private Date updatedAt;
}
