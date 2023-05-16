package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person.getAge());
        System.out.println(person.getSurname());

        context.close();

    }
}
