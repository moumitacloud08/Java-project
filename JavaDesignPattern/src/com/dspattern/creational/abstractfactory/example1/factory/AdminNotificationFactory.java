package com.dspattern.creational.abstractfactory.example1.factory;

import com.dspattern.creational.abstractfactory.example1.product.AdminEmailNotification;
import com.dspattern.creational.abstractfactory.example1.product.AdminSmsNotification;
import com.dspattern.creational.abstractfactory.example1.product.EmailNotification;
import com.dspattern.creational.abstractfactory.example1.product.SmsNotification;

public class AdminNotificationFactory  implements NotificationFactory {
    @Override
    public EmailNotification createEmailNotification() {
        return new AdminEmailNotification();
    }

    @Override
    public SmsNotification createSmsNotification() {
        return new AdminSmsNotification();
    }
}
