package br.com.mastertech.access.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Door {
    private Long id;
    @JsonProperty("andar")
    private String floor;
    @JsonProperty("sala")
    private String room;

    public Door(Long id, String floor, String room) {
        this.id = id;
        this.floor = floor;
        this.room = room;
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
