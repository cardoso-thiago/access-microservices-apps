package br.com.mastertech.access.model;

public class AccessInfo {
    private Boolean hasAccess;
    private Long customer;
    private Long door;

    public AccessInfo() {
    }

    public AccessInfo(Boolean hasAccess, Long customer, Long door) {
        this.hasAccess = hasAccess;
        this.customer = customer;
        this.door = door;
    }

    public Boolean getHasAccess() {
        return hasAccess;
    }

    public Long getCustomer() {
        return customer;
    }

    public Long getDoor() {
        return door;
    }
}
