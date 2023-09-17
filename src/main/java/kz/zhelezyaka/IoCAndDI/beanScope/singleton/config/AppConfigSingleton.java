package kz.zhelezyaka.IoCAndDI.beanScope.singleton.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kz.zhelezyaka.IoCAndDI.beanScope.singleton.controllers",
                               "kz.zhelezyaka.IoCAndDI.beanScope.singleton.services"})
public class AppConfigSingleton {
}
