package com.cybertek.javaReviews.oopHomeworkSolutions.q08;

public class Value {
    int param =0;
    boolean calledSetter = false;
    boolean calledConstructor = false;
    public Value() {
    }

    public Value(int param) {
        this.param = param;
        this.calledConstructor =true;
    }

    public void setParam(int param) {
        this.param = param;
        this.calledSetter = true;
    }

    public boolean wasModified(){
        return calledSetter;
    }

   // ternary operator
   public int getVal(){
        int val = wasModified()?this.param:calledConstructor?this.param:0;
       return val;
   }
}
