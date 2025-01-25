package lld.src.main.java.org.lokeshdarla.designpatterns.strategy;

import org.lokeshdarla.designpatterns.strategy.modes.CyclingRouteStrategy;
import org.lokeshdarla.designpatterns.strategy.modes.DrivingRouteStrategy;
import org.lokeshdarla.designpatterns.strategy.modes.PublicTransportRouteStrategy;
import org.lokeshdarla.designpatterns.strategy.modes.WalkingRouteStrategy;

public class RouteStrategyFactory {
    public static RouteStrategy getStrategy(String mode) {
        switch (mode.toLowerCase()) {
            case "driving":
                return new DrivingRouteStrategy();
            case "walking":
                return new WalkingRouteStrategy();
            case "cycling":
                return new CyclingRouteStrategy();
            case "public transport":
                return new PublicTransportRouteStrategy();
            default:
                throw new IllegalArgumentException("Invalid route mode: " + mode);
        }
    }
}
