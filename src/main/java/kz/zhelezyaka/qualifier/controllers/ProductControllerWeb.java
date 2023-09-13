package kz.zhelezyaka.qualifier.controllers;

import kz.zhelezyaka.qualifier.services.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductControllerWeb implements ProductService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductControllerWeb() {
        System.out.println("Product Web Service Controller was created.");
    }

    @Override
    public void addProduct() {
        System.out.println("Adding product: " + name);
    }

    @Override
    public String toString() {
        return "ProductControllerWeb{" +
                "name='" + name + '\'' +
                '}';
    }
}
