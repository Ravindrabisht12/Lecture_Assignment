/*
Builder Design Pattern - Learning Guide
---------------------------------------
Purpose:
- The Builder pattern helps construct complex objects step by step.
- It separates the construction logic from the representation, making code flexible and readable.

When to use:
- When an object requires many parameters for creation, especially optional ones.
- When you want to avoid telescoping constructors (constructors with many parameters).

How it works in this code:
- The Builder class lets you set properties (name, age, company) one by one.
- After setting desired properties, you pass the builder to the Student constructor, which creates the Student object.
- This approach makes object creation clear and customizable.

Key Benefits:
- Improves code readability and maintainability.
- Makes object creation flexible and less error-prone.
- Supports immutability if the built object does not expose setters.

Example in this file:
- builder.setName("ravindra"); // Set name
- builder.setAge(20);           // Set age
- builder.setCompany("Brill"); // Set company
- Student student = new Student(builder); // Build Student object

Try changing builder properties before building to see how the output changes.
*/
package org.LLD2.DesignPattern.Builder;

public class Client {
    public static void main(String[] args) {
       Builder builder = new Builder();
       builder.setName("ravindra");
       builder.setAge(20);
       builder.setCompany("Brill");


       Student student = new Student(builder);

       builder.setAge(12);
        System.out.println("DEBUG");

    }
}
