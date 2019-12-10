package com.example.demo;

import com.example.demo.notifications.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NotificationConfiguration {

    @Bean
    @Primary
    public NotificationService pigeonService() {
        return () -> Dto.create("Sending pigeon");
    }

}
