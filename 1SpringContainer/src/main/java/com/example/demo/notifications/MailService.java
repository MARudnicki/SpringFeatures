package com.example.demo.notifications;

import com.example.demo.Dto;
import org.springframework.stereotype.Component;

@Component
public class MailService implements NotificationService {

    @Override
    public Dto notifyClient() {
        return Dto.create("sending mail");
    }
}
