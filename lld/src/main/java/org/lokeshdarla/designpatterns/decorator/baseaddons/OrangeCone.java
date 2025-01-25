package lld.src.main.java.org.lokeshdarla.designpatterns.decorator.baseaddons;

import org.lokeshdarla.designpatterns.decorator.IceCream;

public class OrangeCone implements IceCream {
    private IceCream iceCream;

    public OrangeCone() {
        this.iceCream = null;
    }

    public OrangeCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return (iceCream == null ? 1.50 : iceCream.getCost() + 1.50);
    }

    @Override
    public String getDescription() {
        return (iceCream == null ? "Orange Cone" : "Orange Cone, " + iceCream.getDescription());
    }
}
