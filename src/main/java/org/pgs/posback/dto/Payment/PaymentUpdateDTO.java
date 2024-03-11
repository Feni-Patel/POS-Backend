package org.pgs.posback.dto.Payment;

import lombok.Data;
import org.pgs.posback.model.InvoiceModel;

import java.util.Date;

@Data
public class PaymentUpdateDTO {

    private Long id;

    private Double amount;

    private Date dateTime;

    private String paymentMethod;

    private InvoiceModel invoice;

    private Date createdAt;

    private Date updatedAt;
}
