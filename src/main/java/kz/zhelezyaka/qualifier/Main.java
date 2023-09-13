package kz.zhelezyaka.qualifier;

import kz.zhelezyaka.qualifier.config.AppConfig;
import kz.zhelezyaka.qualifier.controllers.FabricProduct;
import kz.zhelezyaka.qualifier.controllers.ProductControllerChatBot;
import kz.zhelezyaka.qualifier.controllers.ProductControllerWeb;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        var fabricProduct = context.getBean(FabricProduct.class);
        var chatBot = context.getBean(ProductControllerChatBot.class);
        var webService = context.getBean(ProductControllerWeb.class);

        chatBot.setName("chatBot");
        System.out.println(chatBot.getName());

        webService.setName("webService");
        System.out.println(webService.getName());

        chatBot.addProduct();
        webService.addProduct();

        System.out.println(fabricProduct.getChatBot());
        System.out.println(fabricProduct.getWebService());

        context.close();
    }
}
