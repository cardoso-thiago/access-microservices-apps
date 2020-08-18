package br.com.mastertech.door.controller;

import br.com.mastertech.door.dto.DoorRequest;
import br.com.mastertech.door.entity.Door;
import br.com.mastertech.door.exception.DoorNotFoundException;
import br.com.mastertech.door.mapper.DoorMapper;
import br.com.mastertech.door.service.DoorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.net.URI;

@RestController
@RequestMapping("/porta")
public class DoorController {

    private final DoorService doorService;

    public DoorController(DoorService doorService) {
        this.doorService = doorService;
    }

    @GetMapping("/{id}")
    public ResponseEntity getDoor(
            @Valid
            @NotNull(message = "O id da porta não pode ser nulo.")
            @Min(value = 1, message = "O id da porta deve ser um número positivo.")
            @PathVariable("id") Long id) throws DoorNotFoundException {
        Door door = doorService.findById(id);
        return ResponseEntity.ok(DoorMapper.INSTANCE.doorToDoorRequest(door));
    }

    @PostMapping
    public ResponseEntity createDoor(@RequestBody @Valid DoorRequest doorRequest) {
        Door savedDoor = doorService.saveDoor(DoorMapper.INSTANCE.doorRequestToDoor(doorRequest));
        return ResponseEntity.created(URI.create("")).body(DoorMapper.INSTANCE.doorToDoorRequest(savedDoor));
    }
}
