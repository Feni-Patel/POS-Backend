package org.pgs.posback.service;

import org.pgs.posback.dto.Payment.PaymentRequestDTO;
import org.pgs.posback.dto.Payment.PaymentResponseDTO;

import java.util.List;

public interface PaymentService {
    List<PaymentResponseDTO> getAllPayments();
    PaymentResponseDTO getPaymentById(Long id);
    PaymentResponseDTO createPayment(PaymentRequestDTO paymentRequestDTO);
    PaymentResponseDTO updatePayment(Long paymentId, PaymentRequestDTO paymentRequestDTO);
    void deletePayment(Long paymentId);
}
