package org.lokeshdarla.designpatterns.decorator;

public class IceCreamDecorator implements IceCream {
    private IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public  double getCost(){
        return iceCream.getCost();
    }

    @Override
    public  String getDescription(){
        return iceCream.getDescription();
    }
}
