package org.lokeshdarla.designpatterns.observer;

public class Client {
    public static void main(String[] args) {
        FlipkartService service = new FlipkartService();
        service.placeOrder("#12445");
    }
}
