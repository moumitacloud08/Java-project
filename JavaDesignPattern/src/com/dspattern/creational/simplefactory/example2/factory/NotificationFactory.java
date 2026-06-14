package com.dspattern.creational.simplefactory.example2.factory;

import com.dspattern.creational.simplefactory.example2.product.EmailNotification;
import com.dspattern.creational.simplefactory.example2.product.Notification;
import com.dspattern.creational.simplefactory.example2.product.SmsNotification;
import com.dspattern.creational.simplefactory.example2.product.WhatsAppNotification;

public class NotificationFactory {
    public static Notification createNotification(String type){
        if(type == null || type.isEmpty())
            return null;

        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            case "whatsapp" -> new WhatsAppNotification();
            default -> throw new IllegalArgumentException("Unknown notification type: " + type);
        };
    }
}
