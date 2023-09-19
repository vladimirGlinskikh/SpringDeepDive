package kz.zhelezyaka.AOP.typeBefore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("kz.zhelezyaka.AOP.typeBefore")
@EnableAspectJAutoProxy
public class Config {
}
