package kz.zhelezyaka.AOP.pointcut;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("kz.zhelezyaka.AOP.pointcut")
@EnableAspectJAutoProxy
public class Config {
}
