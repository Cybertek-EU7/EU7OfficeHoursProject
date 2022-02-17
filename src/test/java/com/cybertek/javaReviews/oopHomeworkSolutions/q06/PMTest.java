package com.cybertek.javaReviews.oopHomeworkSolutions.q06;

public class PMTest {
    public static void main(String[] args) {
        ParkingMeter parkingMeterOne = new ParkingMeter(50);

        parkingMeterOne.add(25);

        System.out.println("parkingMeterOne.timeLeft = " + parkingMeterOne.timeLeft);
        
        while (!parkingMeterOne.isExpired()){
            parkingMeterOne.tick();
            System.out.println("parkingMeterOne.timeLeft = " + parkingMeterOne.timeLeft);

        ParkingMeter parkingMeterTwo = new ParkingMeter();
        parkingMeterTwo.maxTime = 50;


        }
    }
}
