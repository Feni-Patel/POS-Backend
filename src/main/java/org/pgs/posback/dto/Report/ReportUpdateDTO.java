package org.pgs.posback.dto.Report;

import lombok.Data;

import java.util.Date;

@Data
public class ReportUpdateDTO {

    private Long id;

    private String type;

    private Date date;

    private String content;

    private Date createdAt;

    private Date updatedAt;
}
