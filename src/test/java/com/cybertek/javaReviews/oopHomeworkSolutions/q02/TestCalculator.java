package com.cybertek.javaReviews.oopHomeworkSolutions.q02;

import java.util.Scanner;

public class TestCalculator {
// Declaring your object refernces, outside main method so I can use them at other methods
  static LameCalculator lcTwo;
  static String name;
  static Scanner scan;

    public static void main(String[] args) {
        LameCalculator lc = new LameCalculator();

        System.out.println(lc.plus(1,1));

        lcTwo = new LameCalculator();

        System.out.println(anotherMethod());
    }

    public static int anotherMethod(){
       return lcTwo.multiply(2,2);
    }
}
