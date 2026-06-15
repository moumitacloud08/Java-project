package com.dspattern.creational.abstractfactory.example1;

import com.dspattern.creational.abstractfactory.example1.factory.AdminNotificationFactory;
import com.dspattern.creational.abstractfactory.example1.factory.NotificationFactory;
import com.dspattern.creational.abstractfactory.example1.factory.UserNotificationFactory;
import com.dspattern.creational.abstractfactory.example1.product.EmailNotification;
import com.dspattern.creational.abstractfactory.example1.product.SmsNotification;


public class MainApp {

    public static void main(String[] args){
        NotificationFactory factory;
        EmailNotification emailNotification;
        SmsNotification smsNotification;

        //setup for user
        factory = new UserNotificationFactory();
        emailNotification = factory.createEmailNotification();
        smsNotification = factory.createSmsNotification();

        emailNotification.notifyUser();
        smsNotification.notifyUser();

        System.out.println();


        //setup for admin
        factory = new AdminNotificationFactory();
        emailNotification = factory.createEmailNotification();
        smsNotification = factory.createSmsNotification();

        emailNotification.notifyUser();
        smsNotification.notifyUser();
    }
}
