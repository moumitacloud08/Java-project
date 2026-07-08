package com.dspattern.structural.decorator.example1.product;

public class SmsNotification implements Notification {

    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Sms: " + message);
    }
}
