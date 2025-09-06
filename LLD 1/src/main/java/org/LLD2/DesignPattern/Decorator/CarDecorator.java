package org.LLD2.DesignPattern.Decorator;

public class CarDecorator implements Car{
    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

    @Override
    public double getCost() {
        return this.car.getCost();
    }
}
