package com.dspattern.creational.abstractfactory.example1.factory;

import com.dspattern.creational.abstractfactory.example1.product.EmailNotification;
import com.dspattern.creational.abstractfactory.example1.product.SmsNotification;
import com.dspattern.creational.abstractfactory.example1.product.UserEmailNotification;
import com.dspattern.creational.abstractfactory.example1.product.UserSmsNotification;

public class UserNotificationFactory implements NotificationFactory {
    @Override
    public EmailNotification createEmailNotification() {
        return new UserEmailNotification();
    }

    @Override
    public SmsNotification createSmsNotification() {
        return new UserSmsNotification();
    }
}
