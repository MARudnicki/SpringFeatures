package com.example.demo;

import com.example.demo.notifications.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
public class MyController {

    private MyService myService;
    private NotificationService notificationService;
//    private Set<NotificationService> notificationServices;

    @GetMapping("/notify")
    public Dto notifyClient() {
        log.info("Notify client called");

        return notificationService.notifyClient();
    }

//    @GetMapping("/notifyAll")
//    public Set<Dto> notifyAllClient(){
//        log.info("Notify all clients called");
//
//        return notificationServices.stream()
//                .map(NotificationService::notifyClient)
//                .collect(Collectors.toSet());
//    }
}
