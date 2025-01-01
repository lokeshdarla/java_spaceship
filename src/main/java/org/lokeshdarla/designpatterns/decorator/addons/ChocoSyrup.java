package org.lokeshdarla.designpatterns.decorator.addons;

import org.lokeshdarla.designpatterns.decorator.IceCream;

public class ChocoSyrup implements IceCream {
    private IceCream iceCream;

    public ChocoSyrup() {
        this.iceCream = null;
    }

    public ChocoSyrup(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        if (iceCream != null) {
            return iceCream.getCost() + 0.50;
        }
       return 0.50;
    }

    @Override
    public String getDescription() {
        if (iceCream != null) {
            return  "Choco Syrup, " + iceCream.getDescription() ;
        }
        return "Choco Syrup";
    }
}
