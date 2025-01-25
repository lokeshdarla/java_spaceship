package lld.src.main.java.org.lokeshdarla.designpatterns.strategy.modes;

import org.lokeshdarla.designpatterns.strategy.RouteStrategy;

public class DrivingRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String start, String destination) {
        System.out.println("Calculating driving route from " + start + " to " + destination);
    }
}
