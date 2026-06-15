package com.mistyjangid.springproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springproject1Application implements CommandLineRunner {
    //------------class1(module1)---------------
    //    @Autowired
//    PaymentService paymentserviceobj1;
//
//    @Autowired
//    PaymentService paymentserviceobj2;

    //-----------------class2------------
    final Notificationservice notificationserviceobj;

    public Springproject1Application(
            //@Qualifier("emailnotif")
                                     Notificationservice notificationserviceobj) {
        this.notificationserviceobj = notificationserviceobj; //constructor DI
    }

    public static void main(String[] args) {
        SpringApplication.run(Springproject1Application.class, args);

	}

    @Override
    public void run(String... args) throws Exception {
        //------------class1(module1)---------------
//        System.out.println(paymentserviceobj1.hashCode());
//        System.out.println(paymentserviceobj2.hashCode());
//        paymentserviceobj1.pay();
//        paymentserviceobj2.pay();

        notificationserviceobj.send("hello misty");


    }
}
