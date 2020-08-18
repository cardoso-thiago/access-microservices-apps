package br.com.mastertech.access.repository;

import br.com.mastertech.access.entity.Access;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AccessRepository extends CrudRepository<Access, Long> {
    Optional<Access> findByCustomerIdAndDoorId(Long customerId, Long doorId);

    void deleteByCustomerIdAndDoorId(Long customerId, Long doorId);
}
