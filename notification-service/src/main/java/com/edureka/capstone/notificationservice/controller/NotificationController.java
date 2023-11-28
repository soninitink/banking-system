package com.edureka.capstone.notificationservice.controller;

import com.edureka.capstone.notificationservice.entity.Notification;
import com.edureka.capstone.notificationservice.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/notification")
public class NotificationController {
    @Autowired
    NotificationService notificationService;
    @GetMapping("/{userId}")
    public Notification getUsersLastNotification(@PathVariable Long userId){
        return notificationService.getUsersLastNotification(userId);
    }
    @PostMapping
    public Notification createNotification(@RequestBody Notification notification){
        return notificationService.createNotification(notification);
    }
}
