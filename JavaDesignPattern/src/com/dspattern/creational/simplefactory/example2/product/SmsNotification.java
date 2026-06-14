package com.dspattern.creational.simplefactory.example2.product;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending sms.....");
    }
}
