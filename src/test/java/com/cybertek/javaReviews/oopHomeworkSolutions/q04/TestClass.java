package com.cybertek.javaReviews.oopHomeworkSolutions.q04;

public class TestClass {
    public static void main(String[] args) {

        PersonReadOnly personImmutable = new PersonReadOnly("Oscar","Teacher",44);

        personImmutable.getFirstName();
        personImmutable.getLastName();

        PersonWriteOnly personWriteOnly = new PersonWriteOnly("Oscar","Teacher",44);

        personWriteOnly.setAge(30);
        personWriteOnly.setFirstName("Ahmet");

        System.out.println(personWriteOnly);
    }
}
