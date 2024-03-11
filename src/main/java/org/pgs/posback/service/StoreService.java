package org.pgs.posback.service;


import org.pgs.posback.dto.Store.StoreRequestDTO;
import org.pgs.posback.dto.Store.StoreResponseDTO;

import java.util.List;

public interface StoreService {

    List<StoreResponseDTO> getAllStores();

    StoreResponseDTO getStoreById(Long id);

    StoreResponseDTO createStore(StoreRequestDTO storeRequestDTO);

    StoreResponseDTO updateStore(Long storeId, StoreRequestDTO storeRequestDTO);

    void deleteStore(Long storeId);
}