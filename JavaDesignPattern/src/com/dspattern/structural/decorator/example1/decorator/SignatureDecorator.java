package com.dspattern.structural.decorator.example1.decorator;

import com.dspattern.structural.decorator.example1.product.Notification;

public class SignatureDecorator extends NotificationDecorator{

    private String signature;

    public SignatureDecorator(Notification wrappedNotification, String signature) {
        super(wrappedNotification);
        this.signature = signature;
    }

    @Override
    public void notifyUser(String message) {
        String signatureMessage =  message +"\n---"+signature;
        super.notifyUser(signatureMessage);
    }
}
