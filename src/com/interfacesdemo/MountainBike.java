package com.interfacesdemo;

public class MountainBike implements Bicycle {
    private int seatHeight;
    private int speed;
    private int gear;

    public MountainBike(int gear, int speed, int seatHeight) {
        this.seatHeight = seatHeight;
        this.gear = gear;
        this.speed = speed;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }


}
