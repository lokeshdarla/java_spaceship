package org.lokeshdarla.designpatterns.decorator.addons;

import org.lokeshdarla.designpatterns.decorator.IceCream;
import org.lokeshdarla.designpatterns.decorator.IceCreamDecorator;

public  class ChocoChips extends IceCreamDecorator {
    public ChocoChips(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.65;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Choco Chips";
    }
}
