package org.LLD2.DesignPattern.Decorator;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }

    @Override
    public double getCost() {
        return super.getCost() + 20000;
    }
}
