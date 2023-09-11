package kz.zhelezyaka.beanScope.singleton;

import kz.zhelezyaka.beanScope.singleton.config.AppConfigSingleton;
import kz.zhelezyaka.beanScope.singleton.controllers.ProductController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var contextSingleton = new AnnotationConfigApplicationContext(AppConfigSingleton.class);

        ProductController controller1 = contextSingleton.getBean(ProductController.class);
        controller1.setProductName("chatBot");
        ProductController controller2 = contextSingleton.getBean(ProductController.class);
        controller2.setProductName("webService");

        // Singleton подходит для stateless объектов, то есть для объектов,
        // состояние которых нам менять не приходится.

        /* так, как у нас singleton, то эти два объекта по сути один, потому, что
        они ссылаются на один объект в памяти и
        на выходе мы получим имя webService два раза, так как мы меняем
        состояние объекта и таким образом мы меняем имя у всех объектов.*/

        System.out.println(controller1.getProductName());
        System.out.println(controller2.getProductName());


//        // проверяем, это один и тот же объект?
//        // по умолчанию у нас скоуп singleton, значит объект один создается
//        System.out.println("controller1 и controller2 ссылаются на один и тот же объект? " +
//                (controller1 == controller2));
//        System.out.println(controller1);
//        System.out.println(controller2);

        contextSingleton.close();
    }
}
