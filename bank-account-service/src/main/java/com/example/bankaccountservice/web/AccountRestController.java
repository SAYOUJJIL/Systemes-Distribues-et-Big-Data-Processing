package com.example.bankaccountservice.web;

import com.example.bankaccountservice.entities.BankAccount;
import com.example.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

//puisque c'est un connecteur rest donc on va utilisé RESTCONTROLLER
@RestController
// pour acceder à ce service il faut passer par /api/bankaccounts
@RequestMapping("api")
public class AccountRestController {
    @Autowired
    private BankAccountRepository bankAccountRepository;

    @GetMapping("/bankAccounts")
    public List<BankAccount> bankAccounts(){
        return bankAccountRepository.findAll();
    }

    @GetMapping("/bankAccounts/{id}")
    public BankAccount bankAccount(@PathVariable String id){
        return bankAccountRepository.findById(id).orElseThrow(()->new RuntimeException("Account not found"));
    }

    @PostMapping("/bankAccounts")
    public BankAccount saveBankAccount(@RequestBody BankAccount bankAccount){
        bankAccount.setId(UUID.randomUUID().toString());
        return bankAccountRepository.save(bankAccount);
    }

    @PutMapping("/bankAccounts/{id}")
    public BankAccount updateBankAccount(@PathVariable String id,@RequestBody BankAccount bankAccount){
        BankAccount account = bankAccountRepository.findById(id).orElseThrow(()->new RuntimeException("Account not found"));
        // si l'utilsateur n'a pas envoyer la banlance
        if (account.getBalance()!=null) account.setBalance(bankAccount.getBalance());
        //account.setBalance(bankAccount.getBalance());
        if (account.getCreatedAt()!=null) account.setCreatedAt(new Date());
        if (account.getType()!=null) account.setType(bankAccount.getType());
        account.setCurrency(bankAccount.getCurrency());
        return bankAccountRepository.save(account);
    }

    @DeleteMapping("/bankAccounts/{id}")
    public void deleteBankAccount(@PathVariable String id){
        bankAccountRepository.deleteById(id);
    }
}
