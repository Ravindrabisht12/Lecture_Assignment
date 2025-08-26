package org.LLD2.DesignPattern.Builder;

/**
 * Student class built using the Builder pattern.
 *
 * Learning Note:
 * - The Builder pattern helps construct complex objects step by step.
 * - For best practice, the built object should be immutable (no setters), so its state cannot change after creation.
 * - The Builder should be a static inner class for full encapsulation and to allow a private constructor.
 * - This ensures that all validation and setup happens only once, inside the constructor.
 * - If you need to change values, create a new Builder and build a new object.
 */
public class Student {
    private final String name;
    private final int age;
    private final String company;
    private final double psp;
    private final String batch;

    Student(Builder builder){
        // Validation: Ensure age is at least 18
        if(builder.age < 18){
            throw new RuntimeException("Age must not be less than 18");
        }

        this.name = builder.name;
        this.age = builder.age;
        this.company = builder.company;
        this.psp = builder.psp;
        this.batch = builder.batch;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    // Getters only, no setters to keep Student immutable
    public String getName() {
        return name;
    }

    public double getPsp() {
        return psp;
    }

    public int getAge() {
        return age;
    }

    public String getBatch() {
        return batch;
    }

    public String getCompany() {
        return company;
    }

    /**
     * Static inner Builder class for Student
     */
    public static class Builder {
        private String name;
        private int age;
        private String company;
        private double psp;
        private String batch;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
