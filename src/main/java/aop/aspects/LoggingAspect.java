package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddBookLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature - "+ methodSignature);
        System.out.println("methodSignature.getMethod() - "+ methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType - "+ methodSignature.getReturnType());
        System.out.println("methodSignature.getName - "+ methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj: arguments){
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println(myBook.getName()+" "+ myBook.getYear());
                }
                else if(obj instanceof String){
                    System.out.println("Book was added by "+ obj);
                }
            }
        }
        System.out.println("Logging");
        System.out.println("--------------------------------");
    }
}
