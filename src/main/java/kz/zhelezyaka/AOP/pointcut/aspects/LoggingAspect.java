package kz.zhelezyaka.AOP.pointcut.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void get*())")
    public void beforeGetTransportAdvice() {
        System.out.println("beforeGetTransportAdvice(): trying to get a rental transport");
    }

    @Before("execution(* *())")
    public void beforeReturnTransportAdvice() {
        System.out.println("beforeReturnTransportAdvice(): trying to return a rental transport");
    }
}
