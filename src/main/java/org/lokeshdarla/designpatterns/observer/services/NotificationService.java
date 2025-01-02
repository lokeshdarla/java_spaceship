package org.lokeshdarla.designpatterns.observer.services;

import org.lokeshdarla.designpatterns.observer.Observer;
import org.lokeshdarla.designpatterns.observer.PlaceOrderService;

public class NotificationService implements Observer {

    public NotificationService() {
        PlaceOrderService service = PlaceOrderService.getInstance();
        service.addObserver(this);
    }

    @Override
    public void update(String orderId) {
        System.out.println("NotificationService: Customer notified for order " + orderId);
    }
}