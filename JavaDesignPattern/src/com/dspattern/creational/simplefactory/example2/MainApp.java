package com.dspattern.creational.simplefactory.example2;

import com.dspattern.creational.simplefactory.example2.factory.NotificationFactory;
import com.dspattern.creational.simplefactory.example2.product.Notification;

public class MainApp {
    public static void main(String[] args){
        Notification emailNotification = NotificationFactory.createNotification("email");
        emailNotification.notifyUser();

        Notification smsNotification = NotificationFactory.createNotification("sms");
        smsNotification.notifyUser();

        Notification whatsappNotification = NotificationFactory.createNotification("whatsapp");
        whatsappNotification.notifyUser();

        //Notification pushNotification = NotificationFactory.createNotification("push");
       // pushNotification.notifyUser();
    }
}
