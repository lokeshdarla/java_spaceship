package org.lokeshdarla.designpatterns.factory;

public class Flutter {

    SuppportedPlatforms platform;

    Flutter(SuppportedPlatforms platform) {
        this.platform = platform;
    }

    public  void setTheme(){
        System.out.println("Setting theme ...");
    }

    public  void setRefreshRate(){
        System.out.println("Setting refresh rate to 120Hz   ...");
    }

    public  UIFactory getUIFactory(){
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }
}
