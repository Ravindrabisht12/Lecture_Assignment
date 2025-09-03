package org.LLD2.DesignPattern.Factory.UIFactory;

import org.LLD2.DesignPattern.Factory.UI.Button.Button;
import org.LLD2.DesignPattern.Factory.UI.Menu.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
}
