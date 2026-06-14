package com.dspattern.creational.abstractfactory.example1.product;

public class AdminSmsNotification implements SmsNotification {
    @Override
    public void notifyUser() {
        System.out.println("Sending Admin sms notification...");
    }
}
