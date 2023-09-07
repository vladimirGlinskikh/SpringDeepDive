package kz.zhelezyaka.config;

import kz.zhelezyaka.controllers.LoginController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kz.zhelezyaka.controllers")
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
