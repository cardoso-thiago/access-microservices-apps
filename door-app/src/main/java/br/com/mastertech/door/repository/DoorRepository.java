package br.com.mastertech.door.repository;

import br.com.mastertech.door.entity.Door;
import org.springframework.data.repository.CrudRepository;

public interface DoorRepository extends CrudRepository<Door, Long> {
}
