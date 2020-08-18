package br.com.mastertech.customer.service;

import br.com.mastertech.customer.entity.Customer;
import br.com.mastertech.customer.exception.CustomerNotFoundException;
import br.com.mastertech.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findById(Long id) throws CustomerNotFoundException {
        return customerRepository.findById(id).orElseThrow(() -> new CustomerNotFoundException("O cliente informado não foi encontrado."));
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
