package org.pgs.posback.dto.Account;

import lombok.Data;

import java.util.Date;

@Data
public class AccountResponseDTO {

    private Long id;

    private String username;

    private String password;

    private String role;

    private Date createdAt;

    private Date updatedAt;
}
