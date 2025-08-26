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
