package org.LLD2.DesignPattern.Factory;

import org.LLD2.DesignPattern.Factory.UI.Button.Button;
import org.LLD2.DesignPattern.Factory.UI.Menu.Menu;
import org.LLD2.DesignPattern.Factory.UIFactory.UIFactory;
import org.LLD2.DesignPattern.Factory.enums.Platform;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createFactory(Platform.ANDROID);

        System.out.println("Client: Testing Flutter Application");
        Button b = uiFactory.createButton();
        Menu m = uiFactory.createMenu();

        b.printButtonType();
        m.printMenuType();
    }
}
