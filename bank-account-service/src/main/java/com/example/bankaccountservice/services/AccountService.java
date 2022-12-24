package com.example.bankaccountservice.services;

import com.example.bankaccountservice.dtos.BankAccountRequestDTO;
import com.example.bankaccountservice.dtos.BankAccountResponseDTO;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountRequestDTO);
    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO b);

}
