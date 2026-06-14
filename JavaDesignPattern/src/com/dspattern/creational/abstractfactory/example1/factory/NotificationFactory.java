package com.dspattern.creational.abstractfactory.example1.factory;

import com.dspattern.creational.abstractfactory.example1.product.EmailNotification;
import com.dspattern.creational.abstractfactory.example1.product.SmsNotification;

public interface NotificationFactory {
    EmailNotification createEmailNotification();
    SmsNotification createSmsNotification();
}
