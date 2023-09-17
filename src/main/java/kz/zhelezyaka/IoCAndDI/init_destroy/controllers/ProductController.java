package kz.zhelezyaka.IoCAndDI.init_destroy.controllers;

import kz.zhelezyaka.IoCAndDI.init_destroy.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        System.out.println("Product service is created");
        this.productService = productService;
    }

    @PostConstruct
    public void init() {
        System.out.println("This class ProductController: init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("This class ProductController: destroy method");
    }

    public void addProduct() {
        productService.addProduct();
    }
}
