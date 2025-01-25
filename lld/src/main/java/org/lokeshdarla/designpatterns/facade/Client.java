package lld.src.main.java.org.lokeshdarla.designpatterns.facade;

public class Client {
    public static void main(String[] args) {
        AmazonService amazonService = new AmazonService();
        // Place an order
        amazonService.placeOrder("Smartphone", "JohnDoe", "john.doe@example.com");
    }
}
