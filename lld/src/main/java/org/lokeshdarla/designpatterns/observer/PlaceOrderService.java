package lld.src.main.java.org.lokeshdarla.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class PlaceOrderService implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String lastOrderId;

    private static PlaceOrderService instance;

    public static PlaceOrderService getInstance() {
        if (instance == null) {
            instance = new PlaceOrderService();
        }

        return instance;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.lastOrderId);
        }
    }

    public void placeOrder(String orderId) {
        System.out.println("Order placed: " + orderId);
        this.lastOrderId = orderId;
        notifyObservers();
    }

    public void orderPlaced() {

        for (Observer observer : observers) {
            observer.update(this.lastOrderId);
        }
    }

}
