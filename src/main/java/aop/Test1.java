package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = context.getBean("library", Library.class);
        Book book = context.getBean("book", Book.class);
        library.getBook();

        library.addBook("Olenka", book);
        library.addMagazine();

        context.close();
    }
}
