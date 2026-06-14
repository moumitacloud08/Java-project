package com.dspattern.creational.abstractfactory.example1.product;

public class AdminEmailNotification implements EmailNotification {
    @Override
    public void notifyUser() {
        System.out.println("Sending Admin email notification...");
    }
}
