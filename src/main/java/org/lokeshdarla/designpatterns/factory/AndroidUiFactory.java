package org.lokeshdarla.designpatterns.factory;

import org.lokeshdarla.designpatterns.factory.components.button.AndroidButton;
import org.lokeshdarla.designpatterns.factory.components.dropdown.AndroidDropdown;
import org.lokeshdarla.designpatterns.factory.components.menu.AndroidMenu;

public class AndroidUiFactory implements UIFactory{
    @Override
    public AndroidButton createButton(){
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu(){
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDropdown(){
        return new AndroidDropdown();
    }
}
