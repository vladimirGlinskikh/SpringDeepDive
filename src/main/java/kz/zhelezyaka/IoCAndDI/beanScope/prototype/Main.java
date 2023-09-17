package kz.zhelezyaka.IoCAndDI.beanScope.prototype;

import kz.zhelezyaka.IoCAndDI.beanScope.prototype.controllers.ProductController;
import kz.zhelezyaka.IoCAndDI.beanScope.prototype.config.AppConfigPrototype;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var contextPrototype = new AnnotationConfigApplicationContext(AppConfigPrototype.class);

        ProductController controller1 = contextPrototype.getBean(ProductController.class);
        controller1.setProductName("chatBot");
        ProductController controller2 = contextPrototype.getBean(ProductController.class);
        controller2.setProductName("webService");

        // Prototype подходит для stateful объектов, то есть для объектов,
        // состояние которых нам менять не приходится.

        /* Так как у нас scope Prototype, то объекты разные и соответственно имена
         у объектов разные.*/

        System.out.println(controller1.getProductName());
        System.out.println(controller2.getProductName());


//        // проверяем, это один и тот же объект?
//        // в данном случае у нас скоуп prototype, значит объектов создается два
//        System.out.println("controller1 и controller2 ссылаются на один и тот же объект? " +
//                (controller1 == controller2));
//        System.out.println(controller1);
//        System.out.println(controller2);

        contextPrototype.close();
    }
}
