package br.com.mastertech.door.dto;

import br.com.mastertech.door.dto.builder.DoorRequestBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class DoorRequest {
    private Long id;
    @NotNull(message = "O andar não pode ser nulo.")
    @NotEmpty(message = "O andar não pode ser vazio.")
    @JsonProperty("andar")
    private String floor;
    @NotNull(message = "O nome da sala não pode ser nulo.")
    @NotEmpty(message = "O nome da sala não pode ser vazio.")
    @JsonProperty("sala")
    private String room;

    public DoorRequest(Long id, String floor, String room) {
        this.id = id;
        this.floor = floor;
        this.room = room;
    }

    public static DoorRequestBuilder builder() {
        return DoorRequestBuilder.aDoorRequest();
    }

    public Long getId() {
        return id;
    }

    public String getFloor() {
        return floor;
    }

    public String getRoom() {
        return room;
    }
}
