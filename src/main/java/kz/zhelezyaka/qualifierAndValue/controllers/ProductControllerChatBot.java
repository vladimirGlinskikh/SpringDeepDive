package kz.zhelezyaka.qualifierAndValue.controllers;

import kz.zhelezyaka.qualifierAndValue.services.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductControllerChatBot implements ProductService {

    @Value("chatBot")
    private String name;

    public String getName() {
        return name;
    }

    public ProductControllerChatBot() {
        System.out.println("Product ChatBot Controller was created.");
    }

    @Override
    public void addProduct() {
        System.out.println("Adding product: " + name);
    }

    @Override
    public String toString() {
        return "ProductControllerChatBot{" +
                "name='" + name + '\'' +
                '}';
    }
}
