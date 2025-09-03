package org.LLD2.DesignPattern.Factory.UIFactory;

import org.LLD2.DesignPattern.Factory.UI.Button.Button;
import org.LLD2.DesignPattern.Factory.UI.Button.iOSButton;
import org.LLD2.DesignPattern.Factory.UI.Menu.Menu;
import org.LLD2.DesignPattern.Factory.UI.Menu.iOSMenu;

public class iOSUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new iOSButton();
    }

    @Override
    public Menu createMenu() {
        return new iOSMenu();
    }
}
