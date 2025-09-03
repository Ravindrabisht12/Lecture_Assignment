package org.LLD2.DesignPattern.Factory;

import org.LLD2.DesignPattern.Factory.UIFactory.AndroidUIFactory;
import org.LLD2.DesignPattern.Factory.UIFactory.UIFactoryFactory;
import org.LLD2.DesignPattern.Factory.UIFactory.UIFactory;
import org.LLD2.DesignPattern.Factory.UIFactory.iOSUIFactory;
import org.LLD2.DesignPattern.Factory.enums.Platform;

public class Flutter {
    public void TestFlutter(){
        System.out.println("This is Flutter Application");
    }
    public  void Theme(){
        System.out.println("This is Flutter Theme");
    }

    public void setRefreshRate() {
        System.out.println("Setting refresh rate");
    }

//    public static UIFactory createFactory(Platform platform) {
//        if(platform == Platform.ANDROID){
//            return new AndroidUIFactory();
//        }else if(platform == Platform.IOS){
//           return new iOSUIFactory();
//        }
//        return null;
//    }

    public static UIFactory createFactory(Platform platform) {
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }

}
