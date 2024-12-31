package org.lokeshdarla.designpatterns.factory.components.dropdown;

public class AndroidDropdown implements Dropdown {
    @Override
    public  void openDropdown(){
        System.out.println("Opening Android dropdown");
    }
}
