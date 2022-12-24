package com.example.bankaccountservice.services;

import com.example.bankaccountservice.dtos.CustomerDTO;
import com.example.bankaccountservice.entities.Customer;
import com.example.bankaccountservice.mappers.CustomerMapper;
import com.example.bankaccountservice.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        Customer customer=customerMapper.fromCustomerDTO(customerDTO);
        Customer savedCustomer=customerRepository.save(customer);
        return customerMapper.fromCustomer(savedCustomer);
    }

    @Override
    public List<CustomerDTO> listCustomers() {
        List<Customer> customers= customerRepository.findAll();
        List<CustomerDTO> customerDTOS = customers.stream()
                .map(customer -> customerMapper
                        .fromCustomer(customer))
                .collect(Collectors.toList());
        return customerDTOS;
    }

    @Override
    public CustomerDTO getCustomer(Long customerId) {
        Customer customer = customerRepository.findById(customerId).orElseThrow(()->new RuntimeException(String.format("Customer %s not found",customerId)));
        return customerMapper.fromCustomer(customer);
    }
    @Override
    public CustomerDTO updateCustomer(CustomerDTO customerDTO) {
        Customer customer=customerMapper.fromCustomerDTO(customerDTO);
        Customer savedCustomer=customerRepository.save(customer);
        return customerMapper.fromCustomer(savedCustomer);
    }

    @Override
    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }

    @Override
    public List<CustomerDTO> searchCustomers(String keyword) {
        List<Customer> customers=customerRepository.searchCustomer(keyword);
        List<CustomerDTO> customerDTOS = customers.stream().map(cust -> customerMapper.fromCustomer(cust)).collect(Collectors.toList());
        return customerDTOS;
    }
}