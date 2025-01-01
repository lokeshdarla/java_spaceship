package org.lokeshdarla.designpatterns.decorator.addons;

import org.lokeshdarla.designpatterns.decorator.IceCream;
import org.lokeshdarla.designpatterns.decorator.IceCreamDecorator;

public class VanillaScoop extends IceCreamDecorator {
    public VanillaScoop(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Vanilla Scoop";
    }
}
