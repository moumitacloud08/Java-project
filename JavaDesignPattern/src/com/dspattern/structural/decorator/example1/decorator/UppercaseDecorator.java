package com.dspattern.structural.decorator.example1.decorator;

import com.dspattern.structural.decorator.example1.product.Notification;

public class UppercaseDecorator extends NotificationDecorator{

    public UppercaseDecorator(Notification wrappedNotification) {
        super(wrappedNotification);
    }

    @Override
    public void notifyUser(String message) {
        String uppercaseMessage = message.toUpperCase();
        super.notifyUser(uppercaseMessage);
    }
}
