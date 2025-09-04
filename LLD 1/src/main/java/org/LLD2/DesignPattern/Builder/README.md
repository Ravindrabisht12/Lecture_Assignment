# Builder Design Pattern - Learning Guide

## What is the Builder Pattern?
The Builder pattern is a creational design pattern that helps construct complex objects step by step. It separates the construction logic from the representation, making code flexible and readable.

## When to Use It
- When an object requires many parameters for creation, especially optional ones.
- When you want to avoid telescoping constructors (constructors with many parameters).
- When you want to create immutable objects.

## How It Works
- The Builder class lets you set properties one by one.
- After setting desired properties, you call `build()` to create the object.
- The built object is usually immutable (no setters).

## Example Usage
```java
Student student = Student.getBuilder()
    .setName("Ravindra")
    .setAge(20)
    .setCompany("Brillmark")
    .build();
```

## Key Benefits
- Improves code readability and maintainability.
- Makes object creation flexible and less error-prone.
- Supports immutability if the built object does not expose setters.

## Try It Yourself
- Change builder properties before building to see how the output changes.
- Try adding validation logic in the builder or constructor.

## Further Reading
- [Refactoring Guru: Builder Pattern](https://refactoring.guru/design-patterns/builder)
- [Java Design Patterns: Builder](https://java-design-patterns.com/patterns/builder/)

