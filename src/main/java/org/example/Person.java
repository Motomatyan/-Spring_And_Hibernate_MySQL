package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
    //@Autowired
  //  @Qualifier("dog")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }


    public void setPet(Pet pet) {
        this.pet = pet;
    }
    @Autowired
    public Person(@Qualifier("cat") Pet pet) {
        this.pet = pet;
    }

    public void callYourPet (){
        System.out.println("My hunny-bunny");
        pet.say();
    }
}
