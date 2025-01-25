package lld.src.main.java.org.lokeshdarla.designpatterns.decorator.baseaddons;

import org.lokeshdarla.designpatterns.decorator.IceCream;

public class VanillaCone implements IceCream {
    private IceCream iceCream;

    public VanillaCone() {
        this.iceCream = null;
    }

    public VanillaCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return (iceCream == null ? 1.50 : iceCream.getCost() + 1.50);
    }

    @Override
    public String getDescription() {
        return (iceCream == null ? "Vanilla Cone" : "Vanilla Cone, " + iceCream.getDescription());
    }

}
