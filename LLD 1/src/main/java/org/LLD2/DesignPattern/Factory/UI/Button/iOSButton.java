package org.LLD2.DesignPattern.Factory.UI.Button;

public class iOSButton implements Button{
    @Override
    public void changeSize() {

    }

    @Override
    public void printButtonType() {
        System.out.println("iOS Button");
    }
}
