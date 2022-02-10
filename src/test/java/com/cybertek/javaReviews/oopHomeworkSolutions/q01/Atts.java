package com.cybertek.javaReviews.oopHomeworkSolutions.q01;

public class Atts {
    public String name,color;
    public int amount;

    public String asString(){
        return "name : "+name+" color :"+color+" amount : "+amount;
    }

    public static void main(String[] args) {
        Atts a = new Atts(); // creates our object
        a.name = "table"; // assigning values to our object's attribute
        a.color = "brown";
        a.amount = 1;

        System.out.println(a.asString());

        Atts b = new Atts();
        System.out.println(b.asString());
    }
}
