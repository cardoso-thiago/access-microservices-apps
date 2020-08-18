package br.com.mastertech.door.service;

import br.com.mastertech.door.entity.Door;
import br.com.mastertech.door.exception.DoorNotFoundException;
import br.com.mastertech.door.repository.DoorRepository;
import org.springframework.stereotype.Service;

@Service
public class DoorService {

    private final DoorRepository doorRepository;

    public DoorService(DoorRepository doorRepository) {
        this.doorRepository = doorRepository;
    }

    public Door findById(Long id) throws DoorNotFoundException {
        return doorRepository.findById(id).orElseThrow(() -> new DoorNotFoundException("A porta informada não foi encontrada"));
    }

    public Door saveDoor(Door door) {
        return doorRepository.save(door);
    }
}
