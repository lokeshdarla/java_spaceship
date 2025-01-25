package lld.src.main.java.org.lokeshdarla.designpatterns.decorator.addons;

import org.lokeshdarla.designpatterns.decorator.IceCream;

public class ChocoChips implements IceCream {
    private IceCream iceCream;

    public ChocoChips() {
        this.iceCream = null;
    }

    public ChocoChips(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        if (iceCream != null) {
            return iceCream.getCost() + 0.65;
        }
        return 0.65;
    }

    @Override
    public String getDescription() {
        if (iceCream != null) {
            return "Choco Chips, " + iceCream.getDescription();
        }
        return "Choco Chips";
    }
}
