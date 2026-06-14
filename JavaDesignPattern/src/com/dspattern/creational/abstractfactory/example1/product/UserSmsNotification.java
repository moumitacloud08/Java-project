package com.dspattern.creational.abstractfactory.example1.product;

public class UserSmsNotification implements SmsNotification {
    @Override
    public void notifyUser() {
        System.out.println("Sending User sms notification...");
    }
}
