package lld.src.main.java.org.lokeshdarla.designpatterns.facade;

public class AmazonService {
    private AmazonOrderService amazonOrderService;

    public AmazonService() {
        this.amazonOrderService = new AmazonOrderService();
    }

    public void placeOrder(String product, String user, String email) {
        this.amazonOrderService.placeOrder(product, user, email);
    }

    // we can add dispatch order
    // cancel order
    // other methods...

}
