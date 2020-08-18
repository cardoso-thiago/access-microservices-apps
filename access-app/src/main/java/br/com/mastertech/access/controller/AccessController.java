package br.com.mastertech.access.controller;

import br.com.mastertech.access.dto.AccessRequest;
import br.com.mastertech.access.entity.Access;
import br.com.mastertech.access.exception.AccessNotFoundException;
import br.com.mastertech.access.mapper.AccessMapper;
import br.com.mastertech.access.service.AccessService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.net.URI;

@RestController
@Validated
@RequestMapping("/acesso")
public class AccessController {

    private final AccessService accessService;

    public AccessController(AccessService accessService) {
        this.accessService = accessService;
    }

    @GetMapping("/{cliente_id}/{porta_id}")
    public ResponseEntity getAccess(
            @Valid
            @NotNull(message = "O id do cliente não pode ser nulo.")
            @Min(value = 1, message = "O id do cliente deve ser um número positivo.")
            @PathVariable("cliente_id") Long customerId,
            @Valid
            @NotNull(message = "O id da porta não pode ser nulo.")
            @Min(value = 1, message = "O id da porta deve ser um número positivo.")
            @PathVariable("porta_id") Long doorId) throws AccessNotFoundException {
        Access access = accessService.findByCustomerIdAndDoorId(customerId, doorId);
        return ResponseEntity.ok(AccessMapper.INSTANCE.accessToAccessRequest(access));
    }

    @PostMapping
    public ResponseEntity createAccess(@RequestBody @Valid AccessRequest accessRequest) {
        Access savedAccess = accessService.saveAccess(AccessMapper.INSTANCE.accessRequestToAccess(accessRequest));
        return ResponseEntity.created(URI.create("")).body(AccessMapper.INSTANCE.accessToAccessRequest(savedAccess));
    }

    @DeleteMapping("/{cliente_id}/{porta_id}")
    public ResponseEntity deleteAccess(@Valid
                                       @NotNull(message = "O id do cliente não pode ser nulo.")
                                       @Min(value = 1, message = "O id do cliente deve ser um número positivo.")
                                       @PathVariable("cliente_id") Long customerId,
                                       @Valid
                                       @NotNull(message = "O id da porta não pode ser nulo.")
                                       @Min(value = 1, message = "O id da porta deve ser um número positivo.")
                                       @PathVariable("porta_id") Long doorId) {
        accessService.deleteByCustomerIdAndDoorId(customerId, doorId);
        return ResponseEntity.noContent().build();
    }
}
