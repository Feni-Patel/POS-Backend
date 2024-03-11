package org.pgs.posback.dto.Promotion;

import lombok.Data;

import java.util.Date;

@Data
public class PromotionResponseDTO {

    private Long id;

    private String name;

    private Date startDate;

    private Date endDate;

    private Double discountPercentage;

    private Double scheduledAmount;

    private String productCombination;

    private Date createdAt;

    private Date updatedAt;
}

