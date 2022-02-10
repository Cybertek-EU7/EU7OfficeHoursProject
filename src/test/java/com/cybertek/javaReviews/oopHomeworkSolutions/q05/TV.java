package com.cybertek.javaReviews.oopHomeworkSolutions.q05;

public class TV {
    private int channel = 1;
    private int volumeLevel = 1;
    private boolean on = false;
    private String brand = "undifined";

    public TV() {
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(on==false||channel<=0||channel>120){
            System.err.println("ERROR: TV is either OFF or invalid Channel");
            return;
        }
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if(isOn()||volumeLevel>7|volumeLevel<1) {return;}
        this.volumeLevel = volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void channelUp(){
        //channel+=1;
        if(channel<120){
            channel++;
        }

    }
    public void channelDown(){
        if(channel>1){
        channel--;}
    }
    public void volumeUp(){
        volumeLevel+=1;
    }
    public void volumeDown(){
        volumeLevel-=1;
    }
    public boolean isOn(){
        return on;
    }
    public void turnOn(){
        if(on == true){
            System.out.println("TV is already ON");
        }else {
            on=true;
        }
    }
    public void turnOff(){
        if (on==false){
            System.out.println("TV is already OFF");
        }else{
            on=false;
        }
    }


}
