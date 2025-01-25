package lld.src.main.java.org.lokeshdarla.designpatterns.decorator.addons;

import org.lokeshdarla.designpatterns.decorator.IceCream;

public class VanillaScoop implements IceCream {
    private IceCream iceCream;

    public VanillaScoop() {
        this.iceCream = null;
    }

    public VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        if (iceCream != null) {
            return iceCream.getCost() + 0.75;
        }
        return 0.75;
    }

    @Override
    public String getDescription() {
        if (iceCream != null) {
            return "Vanilla Scoop, " + iceCream.getDescription();
        }
        return "Vanilla Scoop";
    }
}
