package kz.zhelezyaka.AOP.typeBefore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var carSet = context.getBean(CarRental.class);
        carSet.getAuto();

        context.close();
    }
}
