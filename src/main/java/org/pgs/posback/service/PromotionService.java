package org.pgs.posback.service;

import org.pgs.posback.dto.Promotion.PromotionRequestDTO;
import org.pgs.posback.dto.Promotion.PromotionResponseDTO;

import java.util.List;

public interface PromotionService {
    List<PromotionResponseDTO> getAllPromotions();

    PromotionResponseDTO getPromotionById(Long id);

    PromotionResponseDTO createPromotion(PromotionRequestDTO promotionRequestDTO);

    PromotionResponseDTO updatePromotion(Long promotionId, PromotionRequestDTO promotionRequestDTO);

    void deletePromotion(Long promotionId);
}