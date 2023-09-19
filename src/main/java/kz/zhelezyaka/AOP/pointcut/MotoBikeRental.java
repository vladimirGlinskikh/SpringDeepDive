package kz.zhelezyaka.AOP.pointcut;

import org.springframework.stereotype.Component;

@Component
public class MotoBikeRental extends AbstractTransportRental{
    @Override
    public void getTransport() {
        System.out.println("We're taken a motobike");
    }

    public void returnTransport(){
        System.out.println("We're back a motobike");
    }
}
