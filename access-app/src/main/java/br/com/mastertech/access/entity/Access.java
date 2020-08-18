package br.com.mastertech.access.entity;

import br.com.mastertech.access.entity.builder.AccessBuilder;

import javax.persistence.*;

@Entity
@Table(name = "access")
public class Access {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "door_id")
    private Long doorId;

    public Access() {
    }

    public Access(Long customerId, Long doorId) {
        this.customerId = customerId;
        this.doorId = doorId;
    }

    public static AccessBuilder builder() {
        return AccessBuilder.anAccess();
    }

    public Long getId() {
        return id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Long getDoorId() {
        return doorId;
    }
}
