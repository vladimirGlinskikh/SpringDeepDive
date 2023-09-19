package kz.zhelezyaka.AOP.typeBefore;

import org.springframework.stereotype.Component;

@Component
public class CarRental {
    public void getAuto(){
        System.out.println("We're taking a car");
    }
}
