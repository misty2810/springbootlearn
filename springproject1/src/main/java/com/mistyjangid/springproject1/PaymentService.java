package com.mistyjangid.springproject1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class PaymentService {
    public void pay(){
        System.out.println("Paying..");
    }

    @PostConstruct
    public void precons(){
        System.out.println("before paying..");
    }

    @PreDestroy
    public void postdest(){
        System.out.println("after paying..");
    }
}
