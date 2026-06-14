package com.dspattern.creational.abstractfactory.example1.product;

public class UserEmailNotification implements EmailNotification {
    @Override
    public void notifyUser() {
        System.out.println("Sending User email notification...");
    }
}
