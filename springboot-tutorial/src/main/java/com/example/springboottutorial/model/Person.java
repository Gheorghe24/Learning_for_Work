package com.example.springboottutorial.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Getter
public class Person {
    private final UUID id;
    @NotBlank
    private final String name;

    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }
}
