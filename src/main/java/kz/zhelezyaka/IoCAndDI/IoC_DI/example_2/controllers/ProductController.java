package kz.zhelezyaka.IoCAndDI.IoC_DI.example_2.controllers;

import kz.zhelezyaka.IoCAndDI.IoC_DI.example_2.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public void addProduct() {
        productService.addProduct();
    }
}
