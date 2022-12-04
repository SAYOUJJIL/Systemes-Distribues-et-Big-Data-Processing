package ma.enset.customerservice.services;

import ma.enset.customerservice.dtos.CustomerRequestDTO;
import ma.enset.customerservice.dtos.CustomerResponseDTO;

import java.util.List;

public interface CustomerService {
    CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO);

    CustomerResponseDTO getCustomer(String id);

    List<CustomerResponseDTO> customers();

    CustomerResponseDTO update(String id, CustomerRequestDTO customerRequestDTO);

    void deleteCustomer(String id);
}
