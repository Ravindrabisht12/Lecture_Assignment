package org.LLD2.DesignPattern.Decorator;

public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }

    @Override
    public double getCost() {
        return super.getCost() + 50000;
    }
}
