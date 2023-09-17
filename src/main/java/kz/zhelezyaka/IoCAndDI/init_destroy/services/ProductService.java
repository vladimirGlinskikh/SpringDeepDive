package kz.zhelezyaka.IoCAndDI.init_destroy.services;

import org.springframework.stereotype.Component;

@Component
public class ProductService {

    public void addProduct() {
        System.out.println("Adding product...");
    }
}
