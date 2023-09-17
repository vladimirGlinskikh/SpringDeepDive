package kz.zhelezyaka.IoCAndDI.qualifierAndValue.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kz.zhelezyaka.IoCAndDI.qualifierAndValue.controllers",
        "kz.zhelezyaka.IoCAndDI.qualifierAndValue.services"})
public class AppConfig {
}
