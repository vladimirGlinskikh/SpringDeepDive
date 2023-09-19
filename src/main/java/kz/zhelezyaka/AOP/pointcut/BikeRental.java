package kz.zhelezyaka.AOP.pointcut;

import org.springframework.stereotype.Component;

@Component
public class BikeRental extends AbstractTransportRental{
    @Override
    public void getTransport() {
        System.out.println("We're taken a bike");
    }
}
