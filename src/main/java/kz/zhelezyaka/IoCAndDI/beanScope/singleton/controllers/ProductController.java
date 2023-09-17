package kz.zhelezyaka.IoCAndDI.beanScope.singleton.controllers;

import kz.zhelezyaka.IoCAndDI.beanScope.singleton.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductController {
    private final ProductService productService;
    private String productName;


    @Autowired
    public ProductController(ProductService productService) {
        System.out.println("Product service is created");
        this.productService = productService;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void addProduct() {
        productService.addProduct();
    }
}
