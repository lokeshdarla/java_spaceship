package lld.src.main.java.org.lokeshdarla.designpatterns.factory;

import org.lokeshdarla.designpatterns.factory.components.button.IOSButton;
import org.lokeshdarla.designpatterns.factory.components.dropdown.IOSDropdown;
import org.lokeshdarla.designpatterns.factory.components.menu.IOSMenu;

public class IOSUiFactory implements UIFactory {
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropdown createDropdown() {
        return new IOSDropdown();
    }
}
