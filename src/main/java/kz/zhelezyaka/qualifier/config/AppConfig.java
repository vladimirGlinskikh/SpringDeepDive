package kz.zhelezyaka.qualifier.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kz.zhelezyaka.qualifier.controllers",
                               "kz.zhelezyaka.qualifier.services"})
public class AppConfig {
}