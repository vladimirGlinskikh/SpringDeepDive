package kz.zhelezyaka.IoCAndDI.IoC_DI.example_2.services;

import org.springframework.stereotype.Component;

@Component
public class ProductService {

    public void addProduct() {
        System.out.println("Adding product...");
    }
}
