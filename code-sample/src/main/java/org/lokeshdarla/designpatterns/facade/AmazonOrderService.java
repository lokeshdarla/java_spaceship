package org.lokeshdarla.designpatterns.facade;

import org.lokeshdarla.designpatterns.facade.services.InventoryManagement;
import org.lokeshdarla.designpatterns.facade.services.LogisticsService;
import org.lokeshdarla.designpatterns.facade.services.NotificationService;
import org.lokeshdarla.designpatterns.facade.services.SellerService;

public class AmazonOrderService {
    private InventoryManagement inventoryManagement;
    private SellerService sellerService;
    private LogisticsService logisticsService;
    private NotificationService notificationService;

    public AmazonOrderService() {
        this.inventoryManagement = new InventoryManagement();
        this.sellerService = new SellerService();
        this.logisticsService = new LogisticsService();
        this.notificationService = new NotificationService();
    }

    public void placeOrder(String product, String user, String email) {
        System.out.println("Placing order for product: " + product);
        inventoryManagement.updateInventory(product);
        sellerService.notifySeller(product);
        logisticsService.initiateLogistics(product);
        notificationService.sendEmail(email);
        notificationService.sendAppNotification(user);
        System.out.println("Order placed successfully!");
    }
}
