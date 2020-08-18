package br.com.mastertech.access.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    private Long id;
    @JsonProperty("nome")
    private String name;

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
