package br.com.mastertech.door.dto.builder;

import br.com.mastertech.door.dto.DoorRequest;

public final class DoorRequestBuilder {
    private Long id;
    private String floor;
    private String room;

    private DoorRequestBuilder() {
    }

    public static DoorRequestBuilder aDoorRequest() {
        return new DoorRequestBuilder();
    }

    public DoorRequestBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public DoorRequestBuilder floor(String floor) {
        this.floor = floor;
        return this;
    }

    public DoorRequestBuilder room(String room) {
        this.room = room;
        return this;
    }

    public DoorRequest build() {
        return new DoorRequest(id, floor, room);
    }
}
