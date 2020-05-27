package com.lab6;

import com.lab6.Run;

public class Bicycle implements Run {

    @Override
    public String getName() {
        return "Bicycle";
    }

    @Override
    public double getMaxSpeed() {
        return 35;
    }

    @Override
    public double getWeight() {
        return 12;
    }

    @Override
    public void move() {
        System.out.println("Bicycle is moving.");
    }
}
