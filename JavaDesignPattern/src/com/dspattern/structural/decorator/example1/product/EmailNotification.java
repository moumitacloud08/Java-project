package com.dspattern.structural.decorator.example1.product;

public class EmailNotification implements Notification {


    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Email: " + message);
    }
}
