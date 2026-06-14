package com.dspattern.creational.simplefactory.example2.product;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending Email.....");
    }
}
