package br.com.mastertech.customer.mapper;

import br.com.mastertech.customer.dto.CustomerRequest;
import br.com.mastertech.customer.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerRequest customerToCustomerRequest(Customer customer);

    Customer customerRequestToCustomer(CustomerRequest customerRequest);
}
