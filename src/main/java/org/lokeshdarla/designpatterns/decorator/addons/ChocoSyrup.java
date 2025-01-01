package org.lokeshdarla.designpatterns.decorator.addons;

import org.lokeshdarla.designpatterns.decorator.IceCream;
import org.lokeshdarla.designpatterns.decorator.IceCreamDecorator;

public class ChocoSyrup extends IceCreamDecorator {
    public ChocoSyrup(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Choco Syrup";
    }
}
