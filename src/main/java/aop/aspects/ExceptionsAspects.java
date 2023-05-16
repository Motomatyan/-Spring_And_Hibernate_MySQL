package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Aspect
@Order(20)
public class ExceptionsAspects {
    //@Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddBookExceptionsCheckAdvice(){
        System.out.println("Exceptions check");
        System.out.println("--------------------------------");
    }
}
