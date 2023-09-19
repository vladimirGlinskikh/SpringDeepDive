package kz.zhelezyaka.AOP.pointcut;

import org.springframework.stereotype.Component;

@Component
public class CarRental extends AbstractTransportRental {

    @Override
    public void getTransport() {
        System.out.println("We're taking a car");
    }
}
