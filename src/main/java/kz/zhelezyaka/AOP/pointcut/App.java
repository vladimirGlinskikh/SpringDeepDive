package kz.zhelezyaka.AOP.pointcut;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var carSet = context.getBean(CarRental.class);
        carSet.getTransport();

        var moto = context.getBean(MotoBikeRental.class);
        moto.getTransport();
        moto.returnTransport();

        var velo = context.getBean(BikeRental.class);
        velo.getTransport();

        context.close();
    }
}
