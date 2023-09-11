package kz.zhelezyaka.beanScope.prototype.controllers;

import kz.zhelezyaka.beanScope.prototype.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
