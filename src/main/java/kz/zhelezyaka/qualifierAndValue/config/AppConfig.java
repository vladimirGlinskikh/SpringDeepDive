package kz.zhelezyaka.qualifierAndValue.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kz.zhelezyaka.qualifierAndValue.controllers",
        "kz.zhelezyaka.qualifierAndValue.services"})
public class AppConfig {
}
