package br.com.mastertech.access.service;

import br.com.mastertech.access.client.ZuulClient;
import br.com.mastertech.access.entity.Access;
import br.com.mastertech.access.exception.AccessNotFoundException;
import br.com.mastertech.access.repository.AccessRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccessService {

    private final AccessRepository accessRepository;
    private final ZuulClient zuulClient;

    public AccessService(AccessRepository accessRepository, ZuulClient zuulClient) {
        this.accessRepository = accessRepository;
        this.zuulClient = zuulClient;
    }

    public Access saveAccess(Access access) {
        return accessRepository.save(access);
    }

    public Access findByCustomerIdAndDoorId(Long customerId, Long doorId) throws AccessNotFoundException {
        zuulClient.getCustomer(customerId);
        zuulClient.getDoor(doorId);
        return accessRepository.findByCustomerIdAndDoorId(customerId, doorId)
                .orElseThrow(() -> new AccessNotFoundException("O acesso informado não foi encontrado."));
    }

    public void deleteByCustomerIdAndDoorId(Long customerId, Long doorId) {
        zuulClient.getCustomer(customerId);
        zuulClient.getDoor(doorId);
        accessRepository.deleteByCustomerIdAndDoorId(customerId, doorId);
    }
}
