package kz.zhelezyaka.IoCAndDI.IoC_DI.example_1.config;

import kz.zhelezyaka.IoCAndDI.IoC_DI.example_1.controllers.LoginController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kz.zhelezyaka.IoCAndDI.IoC_DI.example_1.controllers")
public class AppConfig {

//    @Bean
//    LoginController loginController() {
//        return new LoginController();
//    }
//
    @Bean
    LoginController loginControllerOne() {
        return new LoginController();
    }
}
