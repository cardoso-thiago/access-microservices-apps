package br.com.mastertech.access.service;

import br.com.mastertech.access.client.ZuulClient;
import br.com.mastertech.access.entity.Access;
import br.com.mastertech.access.exception.AccessNotFoundException;
import br.com.mastertech.access.model.AccessInfo;
import br.com.mastertech.access.model.builder.AccessInfoBuilder;
import br.com.mastertech.access.producer.AccessProducer;
import br.com.mastertech.access.repository.AccessRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class AccessService {

    private final AccessRepository accessRepository;
    private final ZuulClient zuulClient;
    private final AccessProducer accessProducer;

    public AccessService(AccessRepository accessRepository, ZuulClient zuulClient, AccessProducer accessProducer) {
        this.accessRepository = accessRepository;
        this.zuulClient = zuulClient;
        this.accessProducer = accessProducer;
    }

    public Access saveAccess(Access access) {
        return accessRepository.save(access);
    }

    public Access findByCustomerIdAndDoorId(Long customerId, Long doorId) throws AccessNotFoundException {
        zuulClient.getCustomer(customerId);
        zuulClient.getDoor(doorId);

        AccessInfo accessInfo = AccessInfoBuilder.anAccessInfo().customer(customerId).door(doorId).build();
        Optional<Access> accessDb = accessRepository.findByCustomerIdAndDoorId(customerId, doorId);
        accessInfo.setHasAccess(accessDb.isPresent());

        accessProducer.sendAccessInfo(accessInfo);

        return accessDb.orElseThrow(() -> new AccessNotFoundException("O acesso informado não foi encontrado."));
    }

    public void deleteByCustomerIdAndDoorId(Long customerId, Long doorId) {
        zuulClient.getCustomer(customerId);
        zuulClient.getDoor(doorId);
        accessRepository.deleteByCustomerIdAndDoorId(customerId, doorId);
    }
}
