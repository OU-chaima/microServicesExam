package org.example.notification;

@Service
public class NotificationService {
    @KafkaListener(topics = "order-topic", groupId = "notification-group")
    public void listen(String message) {
        System.out.println("Notification Received: " + message);

    }
}

