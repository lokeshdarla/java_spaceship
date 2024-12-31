package org.lokeshdarla.designpatterns.factory;

import org.lokeshdarla.designpatterns.factory.components.button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SuppportedPlatforms.ANDROID);
        UIFactory factory=flutter.getUIFactory();
        Button button=factory.createButton();
        button.changeSize();
    }
}
