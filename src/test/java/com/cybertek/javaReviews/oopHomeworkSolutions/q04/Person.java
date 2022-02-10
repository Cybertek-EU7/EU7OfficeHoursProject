package com.cybertek.javaReviews.oopHomeworkSolutions.q04;

public class Person {
    private String firstName,lastName;
    private int age;

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return firstName + " | " + lastName + " | "+ age;
    }

    public Person(){
        this.setFirstName("undefined");
        this.setLastName("undifined");
        this.setAge(-1);
    }

    public Person(String firstName, String lastName, int age) {
       // this.firstName = firstName;
       // this.lastName = lastName;
       // this.age = age;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }
}
