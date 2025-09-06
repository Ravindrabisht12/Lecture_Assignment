# Decorator Design Pattern

## Overview
The Decorator Pattern is a structural design pattern that allows you to dynamically add new behavior to objects by placing them inside special wrapper objects, called decorators. This pattern is useful when you want to add responsibilities to individual objects, without affecting other objects of the same class.

## Key Concepts
- **Component**: The interface or abstract class defining the operations that can be dynamically added to.
- **ConcreteComponent**: The class of objects to which additional responsibilities can be attached.
- **Decorator**: An abstract class that implements the component interface and contains a reference to a component object.
- **ConcreteDecorator**: Adds responsibilities to the component.

## Real-World Examples
- Java I/O Streams (e.g., `BufferedReader`, `InputStreamReader`)
- UI component decorators (e.g., borders, scrollbars)
- Adding toppings to a pizza

## Example in This Project
- `Car` is the component interface.
- `BasicCar` is the concrete component.
- `CarDecorator` is the abstract decorator.
- `SportsCar` and `LuxuryCar` are concrete decorators that add features and cost to the car.

### Sample Usage
```java
Car basicCar = new BasicCar();
Car sportsCar = new SportsCar(basicCar);
Car luxuryCar = new LuxuryCar(basicCar);
Car sportsLuxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
```

## Learning Notes
- Decorators can be stacked to add multiple features.
- The pattern promotes composition over inheritance.
- Useful for adhering to the Open/Closed Principle: classes are open for extension but closed for modification.

## When to Use
- When you need to add responsibilities to objects dynamically and transparently.
- When subclassing would lead to an explosion of new classes for every combination of features.

---

**Explore the code in this folder for hands-on understanding!**

