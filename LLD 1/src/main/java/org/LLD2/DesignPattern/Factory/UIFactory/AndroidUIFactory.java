package org.LLD2.DesignPattern.Factory.UIFactory;

import org.LLD2.DesignPattern.Factory.UI.Button.AndroidButton;
import org.LLD2.DesignPattern.Factory.UI.Button.Button;
import org.LLD2.DesignPattern.Factory.UI.Menu.AndroidMenu;
import org.LLD2.DesignPattern.Factory.UI.Menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
