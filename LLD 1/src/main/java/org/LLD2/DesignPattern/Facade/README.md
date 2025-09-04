# Facade Design Pattern - Learning Guide

## What is the Facade Pattern?
The Facade pattern is a structural design pattern that provides a simplified interface to a complex subsystem. It hides the complexity of the system and exposes only what is necessary for the client.

## When to Use It
- When you want to provide a simple interface to a complex set of classes or APIs.
- When you want to decouple client code from subsystem implementation details.
- When you want to organize code for better readability and maintainability.

## How It Works
- The Facade class wraps multiple subsystem classes and exposes high-level methods for the client.
- The client interacts only with the Facade, not with the subsystems directly.

## Example Usage
```java
BankingFacade facade = new BankingFacade();
facade.openAccount("Ravindra");
facade.applyForLoan("Ravindra", 50000);
```

## Key Benefits
- Reduces complexity for the client.
- Promotes loose coupling between client and subsystem.
- Makes code easier to use and maintain.

## Try It Yourself
- Add more operations to the Facade and see how the client code remains simple.
- Experiment with adding/removing subsystem classes without changing client code.

## Further Reading
- [Refactoring Guru: Facade Pattern](https://refactoring.guru/design-patterns/facade)
- [Java Design Patterns: Facade](https://java-design-patterns.com/patterns/facade/)

