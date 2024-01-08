package com.xiaoli.provider.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class HelloDTO implements Serializable {

    private String name;

    public HelloDTO(String name) {
        this.name = name;
    }
}
