package kz.zhelezyaka.AOP.typeBefore.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void getAuto())")
    public void beforeGetAutoAdvice() {
        System.out.println("beforeGetAutoAdvice(): trying to get a rental car");
    }
}
