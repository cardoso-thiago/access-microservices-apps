package br.com.mastertech.door.entity;

import br.com.mastertech.door.entity.builder.DoorBuilder;

import javax.persistence.*;

@Entity
@Table(name = "door")
public class Door {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String floor;
    @Column
    private String room;

    public Door() {
    }

    public Door(String floor, String room) {
        this.floor = floor;
        this.room = room;
    }

    public static DoorBuilder builder() {
        return DoorBuilder.aDoor();
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
