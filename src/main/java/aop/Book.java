package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("History of cats")
    private String name;
    @Value("2018")
    private int year;


    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

}
