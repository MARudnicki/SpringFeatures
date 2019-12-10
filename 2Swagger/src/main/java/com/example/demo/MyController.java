package com.example.demo;

import com.example.demo.notification.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MyController {


    public MyController(@Qualifier("smsService") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    private NotificationService notificationService;

    @GetMapping("/notify")
    public Dto notifyClient() {
        log.info("Notify client called");

        return notificationService.notifyClient();
    }
}
