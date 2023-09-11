package kz.zhelezyaka.IoC_DI.example_2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kz.zhelezyaka.IoC_DI.example_2.controllers",
                               "kz.zhelezyaka.IoC_DI.example_2.services"})
public class AppConfig {
}
