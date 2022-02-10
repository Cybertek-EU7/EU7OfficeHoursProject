package com.cybertek.javaReviews.oopHomeworkSolutions.q04;

public class PersonReadOnly {
    private String firstName,lastName;
    private int age;

    public PersonReadOnly(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }



}
