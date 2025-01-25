package lld.src.main.java.org.lokeshdarla.designpatterns.factory.components.dropdown;

public class IOSDropdown implements Dropdown {
    @Override
    public void openDropdown() {
        System.out.println("Opening IOS Dropdown");
    }
}
