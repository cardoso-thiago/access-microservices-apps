package br.com.mastertech.customer.controller;

import br.com.mastertech.customer.dto.CustomerRequest;
import br.com.mastertech.customer.entity.Customer;
import br.com.mastertech.customer.exception.CustomerNotFoundException;
import br.com.mastertech.customer.mapper.CustomerMapper;
import br.com.mastertech.customer.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.net.URI;

@RestController
@RequestMapping("/cliente")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity getCustomer(
            @Valid
            @NotNull(message = "O id do cliente não pode ser nulo.")
            @Min(value = 1, message = "O id do cliente deve ser um número positivo.")
            @PathVariable("id") Long id) throws CustomerNotFoundException {
        Customer customer = customerService.findById(id);
        return ResponseEntity.ok(CustomerMapper.INSTANCE.customerToCustomerRequest(customer));
    }

    @PostMapping
    public ResponseEntity createCustomer(@RequestBody @Valid CustomerRequest customerRequest) {
        Customer savedCustomer = customerService.saveCustomer(CustomerMapper.INSTANCE.customerRequestToCustomer(customerRequest));
        return ResponseEntity.created(URI.create("")).body(CustomerMapper.INSTANCE.customerToCustomerRequest(savedCustomer));
    }
}
