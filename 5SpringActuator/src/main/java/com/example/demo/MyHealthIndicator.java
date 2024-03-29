package com.example.demo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

//@Component
public class MyHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {

        return Health.up()
                .status(Status.UNKNOWN)
                .withDetail("that's the key", "that's the value")
                .build();
    }

}
