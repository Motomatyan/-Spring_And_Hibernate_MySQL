package org.example;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{


    public Cat() {
        System.out.println("Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Nya");
    }
}
