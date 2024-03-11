package org.pgs.posback.service;

import org.pgs.posback.dto.Account.AccountRequestDTO;
import org.pgs.posback.dto.Account.AccountResponseDTO;

import java.util.List;

public interface AccountService {

    List<AccountResponseDTO> getAllAccounts();

    AccountResponseDTO getAccountById(Long id);

    AccountResponseDTO createAccount(AccountRequestDTO accountRequestDTO);

    AccountResponseDTO updateAccount(Long accountId, AccountRequestDTO accountRequestDTO);

    void deleteAccount(Long accountId);
}