package br.com.mastertech.access.dto.builder;

import br.com.mastertech.access.dto.AccessRequest;

public final class AccessRequestBuilder {
    private Long customerId;
    private Long doorId;

    private AccessRequestBuilder() {
    }

    public static AccessRequestBuilder anAccessRequest() {
        return new AccessRequestBuilder();
    }

    public AccessRequestBuilder customerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public AccessRequestBuilder doorId(Long doorId) {
        this.doorId = doorId;
        return this;
    }

    public AccessRequest build() {
        return new AccessRequest(customerId, doorId);
    }
}
