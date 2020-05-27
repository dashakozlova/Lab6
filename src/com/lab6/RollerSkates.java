package com.lab6;

import com.lab6.Run;

public class RollerSkates implements Run {

    @Override
    public String getName() {
        return "Jumper";
    }

    @Override
    public double getMaxSpeed() {
        return 100;
    }


    @Override
    public double getWeight() {
        return 18;
    }

    @Override
    public void move() {
        System.out.println("RollerSkates is rolling.");
    }
}