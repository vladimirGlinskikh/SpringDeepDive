package kz.zhelezyaka.xmlExample;

public class SMSBroker implements Broker {
    private String message;

    @Override
    public void sms() {
        System.out.println("sms: " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
