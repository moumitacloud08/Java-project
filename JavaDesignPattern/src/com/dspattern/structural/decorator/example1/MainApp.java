package com.dspattern.structural.decorator.example1;

import com.dspattern.structural.decorator.example1.decorator.NotificationDecorator;
import com.dspattern.structural.decorator.example1.decorator.PriorityDecorator;
import com.dspattern.structural.decorator.example1.decorator.SignatureDecorator;
import com.dspattern.structural.decorator.example1.decorator.UppercaseDecorator;
import com.dspattern.structural.decorator.example1.factory.NotificationFactory;
import com.dspattern.structural.decorator.example1.product.Notification;

public class MainApp {
    public static void main(String[] args){

        //Email with priority
        Notification emailNotification = NotificationFactory.createNotification("email");

        Notification priorityEmail = new PriorityDecorator(emailNotification);
        priorityEmail.notifyUser("Course update available");

        System.out.println();

        //Sms with uppercase
        Notification smsNotification = NotificationFactory.createNotification("sms");

        Notification loudSms = new UppercaseDecorator(smsNotification);
        loudSms.notifyUser("Assignment due tomorrow");

        System.out.println();

        //Whatsapp with signature
        Notification whatsAppNotification = NotificationFactory.createNotification("whatsapp");

        Notification signatureWhatsApp = new SignatureDecorator(whatsAppNotification,"System Admin Team");
        signatureWhatsApp.notifyUser("The servers will be down over the weekend for upgrades. ");

        System.out.println();

        //Whatsapp with priority + uppercase + signature
        Notification multiDecoratorsWhatsApp = new PriorityDecorator(new UppercaseDecorator(new SignatureDecorator(whatsAppNotification,"System Admin Team")));
        multiDecoratorsWhatsApp.notifyUser("The servers will be down over the weekend for upgrades. ");








    }
}
