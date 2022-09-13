package com.example.notification.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class NotificationController {

    @GetMapping("/notification/{notifyTo}")
    public String sendNotification(@PathVariable String notifyTo) {
        log.info("Inside Notification Service");
        return "Notification Sent to : "+notifyTo;
    }
}
