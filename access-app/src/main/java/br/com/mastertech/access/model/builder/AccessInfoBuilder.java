package br.com.mastertech.access.model.builder;

import br.com.mastertech.access.model.AccessInfo;

public final class AccessInfoBuilder {
    private Boolean hasAccess;
    private Long customer;
    private Long door;

    private AccessInfoBuilder() {
    }

    public static AccessInfoBuilder anAccessInfo() {
        return new AccessInfoBuilder();
    }

    public AccessInfoBuilder hasAccess(Boolean hasAccess) {
        this.hasAccess = hasAccess;
        return this;
    }

    public AccessInfoBuilder customer(Long customer) {
        this.customer = customer;
        return this;
    }

    public AccessInfoBuilder door(Long door) {
        this.door = door;
        return this;
    }

    public AccessInfo build() {
        return new AccessInfo(hasAccess, customer, door);
    }
}
