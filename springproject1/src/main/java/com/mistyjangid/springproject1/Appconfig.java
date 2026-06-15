package com.mistyjangid.springproject1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Appconfig {

    @Bean
    @Scope("prototype")
    public PaymentService paymentservice(){
        System.out.println("Bean is created by configuration");
        return new PaymentService();
    }
}
