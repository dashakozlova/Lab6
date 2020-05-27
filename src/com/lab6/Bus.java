package com.lab6;

public class Bus extends Machine{

    int passengersAmount;

    public Bus(String name, double weight, double maxSpeed) {
        super(name, weight, maxSpeed);
    }

    public Bus(String name, double weight, double maxSpeed, int passengersAmount) {
        this(name, weight, maxSpeed);
        this.passengersAmount = passengersAmount;
    }

    public int getPassengersAmount () {
        return passengersAmount;
    }
}