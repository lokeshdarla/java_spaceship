package lld.src.main.java.org.lokeshdarla.designpatterns.observer;

import org.lokeshdarla.designpatterns.observer.services.InventoryService;
import org.lokeshdarla.designpatterns.observer.services.NotificationService;
import org.lokeshdarla.designpatterns.observer.services.ShippingService;

public class FlipkartService {
    public void placeOrder(String OrderId) {
        PlaceOrderService service = PlaceOrderService.getInstance();
        InventoryService inventoryService = new InventoryService();
        NotificationService notificationService = new NotificationService();
        ShippingService shippingService = new ShippingService();

        service.placeOrder(OrderId);
    }
}
