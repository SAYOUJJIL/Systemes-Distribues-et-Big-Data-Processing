package com.example.bankaccountservice.dtos;

import com.example.bankaccountservice.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankAccountResponseDTO{
    private  String id;
    private  Date createdAt;
    private  Double balance;
    private  String currency;
    private  AccountType type;
}
