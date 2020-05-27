package com.lab6;

import com.lab6.Run;

public class Car implements Run {

    @Override
    public String getName() {
        return "Car";
    }

    @Override
    public double getMaxSpeed() {
        return 160;
    }

    @Override
    public double getWeight() {
        return 2000;
    }

    @Override
    public void move() {
        System.out.println("Car is moving.");
    }
}