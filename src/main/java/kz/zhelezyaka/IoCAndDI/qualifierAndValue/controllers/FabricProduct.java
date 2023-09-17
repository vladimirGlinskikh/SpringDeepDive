package kz.zhelezyaka.IoCAndDI.qualifierAndValue.controllers;

import kz.zhelezyaka.IoCAndDI.qualifierAndValue.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FabricProduct {
   private final ProductService webService;
   private final ProductService chatBot;

    public ProductService getWebService() {
        return webService;
    }

    public ProductService getChatBot() {
        return chatBot;
    }

    @Autowired
    public FabricProduct(@Qualifier("productControllerWeb") ProductService webService,
                         @Qualifier("productControllerChatBot") ProductService chatBot) {
        this.webService = webService;
        this.chatBot = chatBot;
    }
}
