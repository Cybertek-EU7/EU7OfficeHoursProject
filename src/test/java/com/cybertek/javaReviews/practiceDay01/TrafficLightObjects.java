package com.cybertek.javaReviews.practiceDay01;

public class TrafficLightObjects {

    public static void main(String[] args) {

        TrafficLight trafficLight; // Object variable / reference to object

        trafficLight = new TrafficLight("09:42 PM"); // new TrafficLight(); this statement holds the object

        //  new TrafficLight().changeColor("yellow");

        trafficLight.changeColor("red");

        trafficLight.showColor();

        trafficLight.changeColor("black");

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("yellow");

        System.out.println("trafficLight2 = " + trafficLight2.localTime);
        System.out.println("TrafficLight.localTime = " + TrafficLight.localTime);
        System.out.println("trafficLight = " + trafficLight.localTime);


        trafficLight.showColor();
        trafficLight2.showColor();

        TrafficLight.showTime();


        // CTRL+ALT+L : Windows
        // CMND + Options + L MAC
    }

}
