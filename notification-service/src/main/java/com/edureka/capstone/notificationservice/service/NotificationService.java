package com.edureka.capstone.notificationservice.service;

import com.edureka.capstone.notificationservice.entity.Notification;
import com.edureka.capstone.notificationservice.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {
    @Autowired
    NotificationRepository notificationRepository;

    public Notification getUsersLastNotification(Long userId){
        Notification notification = notificationRepository.findById(userId).orElse(null);
        if(notification != null) {
            notificationRepository.deleteById(userId);
        }
        return notification;
    }
    public Notification createNotification(Notification notification){
        return notificationRepository.save(notification);
    }

}
