package br.com.mastertech.door.entity.builder;

import br.com.mastertech.door.entity.Door;

public final class DoorBuilder {
    private String floor;
    private String room;

    private DoorBuilder() {
    }

    public static DoorBuilder aDoor() {
        return new DoorBuilder();
    }

    public DoorBuilder floor(String floor) {
        this.floor = floor;
        return this;
    }

    public DoorBuilder room(String room) {
        this.room = room;
        return this;
    }

    public Door build() {
        return new Door(floor, room);
    }
}
