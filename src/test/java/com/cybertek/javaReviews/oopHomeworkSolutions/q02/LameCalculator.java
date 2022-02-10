package com.cybertek.javaReviews.oopHomeworkSolutions.q02;

public class LameCalculator {
    public int plus(int x,int y){
        return x+y;
    }
    public int minus(int x,int y){
        return x-y;
    }
    // Note: I can use the same variable name, the reason is they are local variables (belongs only to that method)
    public int multiply (int x,int y){
        return x*y;
    }
    public int divide(int x,int y){
        return x/y;
    }
//Note: public access modifier can be reached from anywhere and from different packages,  for protected access modifier to be able to use it there must be inheritance relationship


}
