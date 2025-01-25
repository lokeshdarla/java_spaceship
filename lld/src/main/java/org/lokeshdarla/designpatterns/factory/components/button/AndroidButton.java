package lld.src.main.java.org.lokeshdarla.designpatterns.factory.components.button;

public class AndroidButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("Change size of AndroidButton");
    }
}
