package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundLoggingAspect {
    @Around("execution(* returnBook(..))")
    public Object aroundAspectLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
                System.out.println("Around advice starts");

                Object targetMethodResult = proceedingJoinPoint.proceed();

                System.out.println("Around advice ands");

               return targetMethodResult;
    }
}
