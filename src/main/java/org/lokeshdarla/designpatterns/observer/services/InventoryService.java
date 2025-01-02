package org.lokeshdarla.designpatterns.observer.services;

import org.lokeshdarla.designpatterns.observer.Observer;
import org.lokeshdarla.designpatterns.observer.PlaceOrderService;

public class InventoryService implements Observer {

    public InventoryService() {
        PlaceOrderService service = PlaceOrderService.getInstance();
        service.addObserver(this);
    }

    @Override
    public void update(String orderId) {
        System.out.println("InventoryService: Stock updated for order " + orderId);
    }
}
