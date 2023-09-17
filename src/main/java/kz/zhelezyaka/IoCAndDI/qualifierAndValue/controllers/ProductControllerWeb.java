package kz.zhelezyaka.IoCAndDI.qualifierAndValue.controllers;

import kz.zhelezyaka.IoCAndDI.qualifierAndValue.services.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductControllerWeb implements ProductService {

    @Value("webService")
    private String name;

    public String getName() {
        return name;
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
