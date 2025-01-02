package org.lokeshdarla.designpatterns.strategy;

import org.lokeshdarla.designpatterns.strategy.modes.CyclingRouteStrategy;
import org.lokeshdarla.designpatterns.strategy.modes.DrivingRouteStrategy;
import org.lokeshdarla.designpatterns.strategy.modes.PublicTransportRouteStrategy;
import org.lokeshdarla.designpatterns.strategy.modes.WalkingRouteStrategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();

        googleMaps.setRouteStrategy(new DrivingRouteStrategy());
        googleMaps.calculateRoute("New York", "Boston");


        googleMaps.setRouteStrategy(new WalkingRouteStrategy());
        googleMaps.calculateRoute("New York", "Central Park");


        googleMaps.setRouteStrategy(new CyclingRouteStrategy());
        googleMaps.calculateRoute("New York", "Brooklyn");


        googleMaps.setRouteStrategy(new PublicTransportRouteStrategy());
        googleMaps.calculateRoute("New York", "Washington, D.C.");
    }
}
