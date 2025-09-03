package org.LLD2.DesignPattern.Factory.UIFactory;

import org.LLD2.DesignPattern.Factory.enums.Platform;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryForPlatform(Platform platform) {
        return switch (platform) {
            case IOS -> new iOSUIFactory();
            case ANDROID -> new AndroidUIFactory();
        };
    }
}
