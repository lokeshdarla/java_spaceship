package lld.src.main.java.org.lokeshdarla.designpatterns.factory.components.button;

public class IOSButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("I'm an IOS button");
    }
}
