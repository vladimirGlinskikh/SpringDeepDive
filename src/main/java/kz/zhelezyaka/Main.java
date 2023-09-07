package kz.zhelezyaka;

import kz.zhelezyaka.config.AppConfig;
import kz.zhelezyaka.controllers.LoginController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        LoginController loginController =
                context.getBean("loginController", LoginController.class);
        LoginController loginControllerOne =
                context.getBean("loginControllerOne", LoginController.class);
        System.out.println(loginController);
        System.out.println(loginControllerOne);

    }
}
