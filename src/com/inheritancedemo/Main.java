package com.inheritancedemo;

public class Main {
    public static void main(String[] args) {
    MountainBike mountainBike = new MountainBike(20,10,1);
    System.out.println("Mountain Bike gear: " + mountainBike.gear);
        System.out.println("Mountain Bike seat height: " + mountainBike.getSeatHeight());
        System.out.println("Mountain Bike speed: " + mountainBike.speed);
        mountainBike.applyBreaks(5);
        System.out.println("Mountain Bike speed: " + mountainBike.speed);
    }
}
