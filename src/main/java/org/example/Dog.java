package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dog")
public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog bean is created");
    }
   // @PostConstruct

    public void init (){
        System.out.println("Init method");
    }
   // @PreDestroy

    public void destroy(){
        System.out.println("Destroy method");
    }

    @Override
    public void say() {
        System.out.println("Wof");
    }
}
