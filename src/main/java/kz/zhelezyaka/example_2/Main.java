package kz.zhelezyaka.example_2;

import kz.zhelezyaka.example_2.config.AppConfig;
import kz.zhelezyaka.example_2.controllers.ProductController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var controller = context.getBean(ProductController.class);
        controller.addProduct();
    }
}
