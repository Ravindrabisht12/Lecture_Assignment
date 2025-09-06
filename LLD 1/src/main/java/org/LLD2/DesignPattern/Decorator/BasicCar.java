package org.LLD2.DesignPattern.Decorator;

public class BasicCar implements Car{

    @Override
    public void assemble() {
        System.out.println("Basic Car.");
    }

    @Override
    public double getCost() {
        return 10000;
    }
}
