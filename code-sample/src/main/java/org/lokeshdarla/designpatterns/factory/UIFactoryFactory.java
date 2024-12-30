package org.lokeshdarla.designpatterns.factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryForPlatform(SuppportedPlatforms platform) {
        return switch (platform){
            case SuppportedPlatforms.ANDROID -> null;
            case SuppportedPlatforms.IOS -> null;
        };
    }
}
