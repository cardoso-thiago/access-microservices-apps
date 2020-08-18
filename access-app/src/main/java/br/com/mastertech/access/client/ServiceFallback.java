package br.com.mastertech.access.client;

import br.com.mastertech.access.exception.CustomerServiceDownException;
import br.com.mastertech.access.exception.DoorServiceDownException;

public class ServiceFallback implements ZuulClient {
    @Override
    public Customer getCustomer(Long id) {
        throw new CustomerServiceDownException();
    }

    @Override
    public Door getDoor(Long id) {
        throw new DoorServiceDownException();
    }
}
