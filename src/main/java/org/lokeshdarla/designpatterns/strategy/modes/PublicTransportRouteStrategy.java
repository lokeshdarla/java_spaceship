package org.lokeshdarla.designpatterns.strategy.modes;

import org.lokeshdarla.designpatterns.strategy.RouteStrategy;

public class PublicTransportRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String start, String destination) {
        System.out.println("Calculating public transport route from " + start + " to " + destination);
    }
}
