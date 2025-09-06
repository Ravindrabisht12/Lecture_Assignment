package org.LLD2.DesignPattern.Decorator;

/**
 * Decorator Design Pattern Example
 *
 * The Decorator pattern allows behavior to be added to individual objects dynamically,
 * without affecting the behavior of other objects from the same class.
 *
 * Key Components:
 * 1. Component Interface (Car): Defines the interface for objects that can have responsibilities added
 * 2. Concrete Component (BasicCar): The base object that can be decorated
 * 3. Decorator (CarDecorator): Abstract class that implements Component and has a reference to a Component
 * 4. Concrete Decorators (SportsCar, LuxuryCar): Add responsibilities to the component
 *
 * Benefits:
 * - More flexible than inheritance for extending functionality
 * - Allows responsibilities to be added/removed at runtime
 * - Follows Single Responsibility Principle by separating concerns
 * - Enables combining behaviors through multiple decorators
 * - Supports the Open/Closed Principle - extend behavior without modifying existing code
 *
 * Real-world examples:
 * - Java I/O streams (BufferedReader, InputStreamReader, etc.)
 * - UI component decorators (borders, scrollbars)
 * - Pizza toppings on a base pizza
 *
 * In this example:
 * - Basic Car is decorated with Sports and Luxury features
 * - Decorators can be stacked (SportsCar + LuxuryCar)
 * - Each decorator adds its own cost and functionality
 */

public class Client {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        System.out.println("Cost of Basic Car: " + basicCar.getCost());

        Car sportsCar = new SportsCar(basicCar);
        System.out.println("Cost of Sports Car: " + sportsCar.getCost());

        // Luxury basic
        Car luxuryCar = new LuxuryCar(basicCar);
        System.out.println("Cost of Luxury Car: " + luxuryCar.getCost());


        Car sportsLuxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
        System.out.println("Cost of Sports Luxury Car: " + sportsLuxuryCar.getCost());

        System.out.print("Assembling Sports Luxury Car: ");
    }
}
