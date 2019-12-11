package com.example.demo;

import lombok.Value;

@Value(staticConstructor = "create")
public class Dto {

    private String value;
}
