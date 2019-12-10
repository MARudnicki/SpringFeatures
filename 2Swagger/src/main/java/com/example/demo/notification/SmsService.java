package com.example.demo.notification;

import com.example.demo.Dto;
import org.springframework.stereotype.Component;

@Component
public class SmsService implements NotificationService {

    @Override
    public Dto notifyClient() {
        return Dto.create("sending sms");
    }
}
