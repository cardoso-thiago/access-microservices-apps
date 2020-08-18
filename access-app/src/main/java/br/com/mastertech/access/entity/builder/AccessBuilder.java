package br.com.mastertech.access.entity.builder;

import br.com.mastertech.access.entity.Access;

public final class AccessBuilder {
    private Long customerId;
    private Long doorId;

    private AccessBuilder() {
    }

    public static AccessBuilder anAccess() {
        return new AccessBuilder();
    }

    public AccessBuilder customerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public AccessBuilder doorId(Long doorId) {
        this.doorId = doorId;
        return this;
    }

    public Access build() {
        return new Access(customerId, doorId);
    }
}
