package aop;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
public class Library {

    public void getBook(){
        System.out.println("Get a book");
    }

    public void addBook (String person, Book book){
        System.out.println("Add a book");
        System.out.println("--------------------------------");
    }

    public void addMagazine (){
        System.out.println("Add a magazine");
        System.out.println("--------------------------------");
    }

    public String returnBook (){
        System.out.println("Return book");
        return "Meow and meow";
    }
}
