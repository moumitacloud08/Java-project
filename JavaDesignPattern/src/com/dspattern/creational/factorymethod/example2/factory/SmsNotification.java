package com.dspattern.creational.factorymethod.example2.factory;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending sms.....");
    }
}
