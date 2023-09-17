package kz.zhelezyaka.IoCAndDI.init_destroy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kz.zhelezyaka.IoCAndDI.init_destroy.controllers",
                               "kz.zhelezyaka.IoCAndDI.init_destroy.services"})
public class AppConfigInitDestroy {
}
