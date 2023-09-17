package kz.zhelezyaka.IoCAndDI.IoC_DI.example_1;

import kz.zhelezyaka.IoCAndDI.IoC_DI.example_1.config.AppConfig;
import kz.zhelezyaka.IoCAndDI.IoC_DI.example_1.controllers.LoginController;
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
