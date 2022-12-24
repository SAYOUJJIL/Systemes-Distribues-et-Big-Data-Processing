package com.example.billingservice.web;

import com.example.billingservice.dtos.InvoiceRequestDTO;
import com.example.billingservice.dtos.InvoiceResponseDTO;
import com.example.billingservice.exceptions.CustomerNotFoundException;
import com.example.billingservice.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api")
public class InvoiceRestController {
    @Autowired
    private InvoiceService invoiceService;

    @GetMapping(path = "/invoices/{id}")
    public InvoiceResponseDTO getInvoice(@PathVariable(name = "id") String invoiceId){
        return invoiceService.getInvoice(invoiceId);
    }
    @GetMapping(path = "/invoicesByCustomer/{customerID}")
    public List<InvoiceResponseDTO> getInvoicesByCustomer(@PathVariable String customerID){
        return invoiceService.invoicesByCustomerId(customerID);
    }
    @PostMapping(path = "/invoices")
    public InvoiceResponseDTO save(@RequestBody InvoiceRequestDTO invoiceRequestDTO) throws CustomerNotFoundException {
        return invoiceService.save(invoiceRequestDTO);
    }
    @GetMapping(path = "/invoices")
    public List<InvoiceResponseDTO> allInvoices(){
        return invoiceService.allInvoices();
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> exceptionHandler(Exception e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}