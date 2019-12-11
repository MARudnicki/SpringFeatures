package com.example.demo;

import com.example.demo.notifications.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfiguration {

    @Bean
    public NotificationService pigeonService() {
        return () -> Dto.create("Sending pigeon");
    }

}
