package kz.zhelezyaka.xmlExample;

import javax.annotation.PostConstruct;

@Profiling
public class SMSBroker implements Broker {
    @InjectRandomInt(min = 2, max = 5)
    private int reiterate;
    private String message;

    @PostConstruct
    public void init() {
        System.out.println("Start constructor two phase");
        System.out.println(reiterate);
    }

    public SMSBroker() {
        System.out.println("Start constructor one phase");
    }

    @Override
    public void sms() {
        for (int i = 0; i < reiterate; i++) {
            System.out.println("sms: " + message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
