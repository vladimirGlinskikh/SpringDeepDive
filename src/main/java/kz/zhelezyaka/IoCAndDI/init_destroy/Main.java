package kz.zhelezyaka.IoCAndDI.init_destroy;

import kz.zhelezyaka.IoCAndDI.init_destroy.controllers.ProductController;
import kz.zhelezyaka.IoCAndDI.init_destroy.config.AppConfigInitDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var contextInitDestroy =
                new AnnotationConfigApplicationContext(AppConfigInitDestroy.class);

        ProductController controller1 =
                contextInitDestroy.getBean(ProductController.class);
        controller1.addProduct();

        ProductController controller2 =
                contextInitDestroy.getBean(ProductController.class);
        controller2.addProduct();

        contextInitDestroy.close();
    }
}
