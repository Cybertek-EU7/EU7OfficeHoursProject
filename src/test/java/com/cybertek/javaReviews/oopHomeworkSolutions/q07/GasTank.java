package com.cybertek.javaReviews.oopHomeworkSolutions.q07;

public class GasTank {
    double amount = 0;
    double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }
    public void addGas(double a){
        amount+=a;
        if(amount>capacity){
            amount=capacity;
        }
    }

    public void useGas(double gas){
        amount -= gas;
        if(amount < 0){
            amount =0;
        }
    }
    public boolean isEmpty(){
        return (amount<0.1);
    }

    public boolean isFull(){
       return (amount > capacity-0.1);
    }

    public double getGasLevel(){return amount;}

    public double fillUp(){
        double amountBefore = amount;
        amount = capacity;
        return (capacity-amountBefore);
    }

    public static void main(String[] args) {
        GasTank object = new GasTank(20);

        object.addGas(5);

        System.out.println(object.getGasLevel());

    }
}
