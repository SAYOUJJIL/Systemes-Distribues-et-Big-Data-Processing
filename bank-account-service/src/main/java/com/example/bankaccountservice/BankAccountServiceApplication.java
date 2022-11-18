package com.example.bankaccountservice;

import com.example.bankaccountservice.entities.BankAccount;
import com.example.bankaccountservice.entities.Customer;
import com.example.bankaccountservice.enums.AccountType;
import com.example.bankaccountservice.repositories.BankAccountRepository;
import com.example.bankaccountservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class BankAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAccountServiceApplication.class, args);
    }
    @Bean
    // Objet creer au démarrage
    CommandLineRunner start(BankAccountRepository bankAccountRepository, CustomerRepository customerRepository){
        return args -> {
            //creer des clients
            Stream.of("Soukayna","Aya","Hayat","Mohammed").forEach(c->{
                Customer customer= Customer.builder()
                        .name(c)
                        .build();
                customerRepository.save(customer);
            });
            //creer des comptes pour chaque customer
            customerRepository.findAll().forEach(customer -> {
                for (int i=0;i<10;i++){
                    BankAccount bankAccount=BankAccount.builder()
                            .id(UUID.randomUUID().toString())
                            .type(Math.random()>0.5? AccountType.CURRENT_ACCOUNT:AccountType.SAVING_ACCOUNT)
                            .balance(Math.random()*90000)
                            .createdAt(new Date())
                            .currency("MAD")
                            .customer(customer)
                            .build();
                    bankAccountRepository.save(bankAccount);
                }
            });
            for (int i=0;i<10;i++){
                //Créer un objet avec Builder <=> new Bankccount ()
                BankAccount bankAccount = BankAccount.builder()
                        .id(UUID.randomUUID().toString())
                        .type(Math.random()>0.5? AccountType.CURRENT_ACCOUNT:AccountType.SAVING_ACCOUNT)
                        .balance(10000+Math.random()*90000)
                        .currency("MAD")
                        .build();
                bankAccountRepository.save(bankAccount);
            }
        };
    }
}
