package org.LLD2.DesignPattern.Builder;

public class Student {
    private String name;
    private int age;
    private String company;
    private double psp;
    private String batch;

    public Student(Builder builder){
        // Validation
      if(builder.getAge() < 18){
          throw new RuntimeException("Age not less then 18");
      }

      this.name = builder.getName();
      this.age = builder.getAge();
      this.company = builder.getCompany();
      this.psp = builder.getPsp();
      this.batch = builder.getBatch();
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }
}
