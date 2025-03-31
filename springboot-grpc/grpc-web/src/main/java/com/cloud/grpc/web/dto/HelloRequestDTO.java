package com.cloud.grpc.web.dto;

import java.io.Serializable;

public class HelloRequestDTO implements Serializable {
    private String name;

    public HelloRequestDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}