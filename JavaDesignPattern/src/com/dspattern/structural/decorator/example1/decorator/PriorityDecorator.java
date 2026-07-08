package com.dspattern.structural.decorator.example1.decorator;

import com.dspattern.structural.decorator.example1.product.Notification;

/**
 * Decorator that marks a notification as high priority
 * by adding a priority tag to the message
 */
public class PriorityDecorator extends NotificationDecorator{

    public PriorityDecorator(Notification wrappedNotification) {
        super(wrappedNotification);
    }

    @Override
    public void notifyUser(String message) {
        String priorityMessage = "[PRIORITY] " + message;
        super.notifyUser(priorityMessage);
    }
}
