package com.dspattern.creational.simplefactory.example2.product;

public class WhatsAppNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending whatsapp.....");
    }
}
