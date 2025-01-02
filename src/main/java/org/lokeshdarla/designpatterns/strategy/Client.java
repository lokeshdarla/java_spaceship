package org.lokeshdarla.designpatterns.strategy;


public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();

        RouteStrategy drivingStrategy = RouteStrategyFactory.getStrategy("driving");
        googleMaps.setRouteStrategy(drivingStrategy);
        googleMaps.calculateRoute("New York", "Boston");

        RouteStrategy walkingStrategy = RouteStrategyFactory.getStrategy("walking");
        googleMaps.setRouteStrategy(walkingStrategy);
        googleMaps.calculateRoute("New York", "Central Park");

    }
}
