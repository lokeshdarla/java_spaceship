package org.lokeshdarla.designpatterns.strategy.modes;

import org.lokeshdarla.designpatterns.strategy.RouteStrategy;

public class CyclingRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String start, String destination) {
        System.out.println("Calculating cycling route from " + start + " to " + destination);
    }
}
