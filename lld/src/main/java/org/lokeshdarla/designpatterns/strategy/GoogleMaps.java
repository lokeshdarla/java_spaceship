package lld.src.main.java.org.lokeshdarla.designpatterns.strategy;

public class GoogleMaps {
    private RouteStrategy strategy;

    public void setRouteStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void calculateRoute(String start, String destination) {
        if (strategy == null) {
            throw new IllegalStateException("Route strategy not set");
        }
        strategy.calculateRoute(start, destination);
    }
}
