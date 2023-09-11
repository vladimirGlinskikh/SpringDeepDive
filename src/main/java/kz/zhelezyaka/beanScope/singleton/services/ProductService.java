package kz.zhelezyaka.beanScope.singleton.services;

import org.springframework.stereotype.Component;

@Component
public class ProductService {

    public void addProduct() {
        System.out.println("Adding product...");
    }
}
