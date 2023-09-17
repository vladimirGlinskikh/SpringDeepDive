package kz.zhelezyaka.IoCAndDI.qualifierAndValue;

import kz.zhelezyaka.IoCAndDI.qualifierAndValue.config.AppConfig;
import kz.zhelezyaka.IoCAndDI.qualifierAndValue.controllers.FabricProduct;
import kz.zhelezyaka.IoCAndDI.qualifierAndValue.controllers.ProductControllerChatBot;
import kz.zhelezyaka.IoCAndDI.qualifierAndValue.controllers.ProductControllerWeb;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        var fabricProduct = context.getBean(FabricProduct.class);
        var chatBot = context.getBean(ProductControllerChatBot.class);
        var webService = context.getBean(ProductControllerWeb.class);

        System.out.println(chatBot.getName());
        System.out.println(webService.getName());

        chatBot.addProduct();
        webService.addProduct();

        System.out.println(fabricProduct.getChatBot());
        System.out.println(fabricProduct.getWebService());

        context.close();
    }
}
