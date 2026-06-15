package com.mistyjangid.springproject1.implementation;

import com.mistyjangid.springproject1.Notificationservice;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emailnotif")
@ConditionalOnProperty(name="Notification.type", havingValue = "email")
public class EmailService implements Notificationservice {

    @Override
    public void send(String msg) {
        System.out.println("email sending.."+msg);
    }
}
