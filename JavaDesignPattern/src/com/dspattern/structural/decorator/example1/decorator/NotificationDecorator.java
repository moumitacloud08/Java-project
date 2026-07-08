package com.dspattern.structural.decorator.example1.decorator;

import com.dspattern.structural.decorator.example1.product.Notification;

/**
 * Abstract decorator that wraps a notification
 * and forwards calls to it
 */
public abstract class NotificationDecorator implements Notification {

    private Notification wrappedNotification;

    public NotificationDecorator(Notification wrappedNotification) {
        this.wrappedNotification = wrappedNotification;
    }

    @Override
    public void notifyUser(String message) {
        wrappedNotification.notifyUser(message);
    }
}
