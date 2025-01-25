package lld.src.main.java.org.lokeshdarla.designpatterns.factory;

import org.lokeshdarla.designpatterns.factory.components.button.Button;
import org.lokeshdarla.designpatterns.factory.components.menu.Menu;
import org.lokeshdarla.designpatterns.factory.components.dropdown.Dropdown;

public interface UIFactory {
    public Button createButton();

    public Menu createMenu();

    public Dropdown createDropdown();
}
