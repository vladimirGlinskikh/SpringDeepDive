package kz.zhelezyaka.beanScope.singleton.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kz.zhelezyaka.beanScope.singleton.controllers",
                               "kz.zhelezyaka.beanScope.singleton.services"})
public class AppConfigSingleton {
}
