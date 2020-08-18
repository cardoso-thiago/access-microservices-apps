package br.com.mastertech.access.dto;

import br.com.mastertech.access.dto.builder.AccessRequestBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class AccessRequest {
    @NotNull(message = "O id do cliente não pode ser nulo.")
    @Min(value = 1, message = "O id do cliente deve ser um número positivo.")
    @JsonProperty("cliente_id")
    private Long customerId;
    @NotNull(message = "O id da porta não pode ser nulo.")
    @Min(value = 1, message = "O id da porta deve ser um número positivo.")
    @JsonProperty("porta_id")
    private Long doorId;

    public AccessRequest(Long customerId, Long doorId) {
        this.customerId = customerId;
        this.doorId = doorId;
    }

    public static AccessRequestBuilder builder() {
        return AccessRequestBuilder.anAccessRequest();
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Long getDoorId() {
        return doorId;
    }
}
