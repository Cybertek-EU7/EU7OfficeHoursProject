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

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.getFirstName()); //"undefined"
        System.out.println(person.getLastName()); //"undefined"
        System.out.println(person.getAge()); // -1
        System.out.println(person.toString()); //"undefined | undefined | -1"

        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(44);

        System.out.println(person.toString() ); // "John | Doe | 44"

        Person personTwo = new Person("Fatima", "Lee", 22);

        System.out.println(personTwo.getFirstName()); //"Fatima"
        System.out.println(personTwo.getLastName()); //"Lee"
        System.out.println(personTwo.getAge()); // 22
        System.out.println(personTwo.toString()); //"Fatima | Lee | 22"
    }
}
