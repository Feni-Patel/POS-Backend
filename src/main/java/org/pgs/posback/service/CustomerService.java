package org.pgs.posback.service;



import org.pgs.posback.dto.Customer.CustomerRequestDTO;
import org.pgs.posback.dto.Customer.CustomerResponseDTO;

import java.util.List;

public interface CustomerService {

    CustomerResponseDTO createCustomer(CustomerRequestDTO customerRequestDTO);

    List<CustomerResponseDTO> getAllCustomer();

    CustomerResponseDTO getById(Long id);

    CustomerResponseDTO updateCustomer(CustomerRequestDTO customerRequestDTO,Long id);

    void deleteCustomer(Long id);
}