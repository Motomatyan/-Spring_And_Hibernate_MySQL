package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class SecurityAspects {
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddBookSecurityAdvice(){
        System.out.println("Security check");
        System.out.println("--------------------------------");
    }
}
