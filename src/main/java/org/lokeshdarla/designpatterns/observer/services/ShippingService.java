package org.lokeshdarla.designpatterns.observer.services;

import org.lokeshdarla.designpatterns.observer.Observer;
import org.lokeshdarla.designpatterns.observer.PlaceOrderService;

public class ShippingService implements Observer {

    public ShippingService() {
        PlaceOrderService service = PlaceOrderService.getInstance();
        service.addObserver(this);
    }

    @Override
    public void update(String orderId) {
        System.out.println("ShippingService: Shipping prepared for order " + orderId);
    }
}
