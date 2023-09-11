package kz.zhelezyaka.beanScope.prototype.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kz.zhelezyaka.beanScope.prototype.controllers",
                               "kz.zhelezyaka.beanScope.prototype.services"})
public class AppConfigPrototype {
}
