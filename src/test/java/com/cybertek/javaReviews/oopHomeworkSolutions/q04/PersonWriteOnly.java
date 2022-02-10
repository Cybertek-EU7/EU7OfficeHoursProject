package com.cybertek.javaReviews.oopHomeworkSolutions.q04;

public class PersonWriteOnly {

    private String firstName,lastName;
    private int age;

    public PersonWriteOnly(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
  }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
