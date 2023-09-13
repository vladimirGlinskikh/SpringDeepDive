package kz.zhelezyaka.init_destroy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kz.zhelezyaka.init_destroy.controllers",
                               "kz.zhelezyaka.init_destroy.services"})
public class AppConfigInitDestroy {
}
