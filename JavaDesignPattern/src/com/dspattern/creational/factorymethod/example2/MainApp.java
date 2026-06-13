package com.dspattern.creational.factorymethod.example2;

public class MainApp {
    public static void main(String[] args){
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("email");
        notificationService.sendNotification("sms");
        notificationService.sendNotification("whatsapp");
        notificationService.sendNotification("push");
    }
}
