package kz.zhelezyaka.IoCAndDI.beanScope.prototype.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kz.zhelezyaka.IoCAndDI.beanScope.prototype.controllers",
                               "kz.zhelezyaka.IoCAndDI.beanScope.prototype.services"})
public class AppConfigPrototype {
}
