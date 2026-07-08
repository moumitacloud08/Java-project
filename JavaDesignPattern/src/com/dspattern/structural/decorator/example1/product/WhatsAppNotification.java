package com.dspattern.structural.decorator.example1.product;

public class WhatsAppNotification implements Notification {

    @Override
    public void notifyUser(String message) {
        System.out.println("Sending whatsapp: " + message);
    }

}
