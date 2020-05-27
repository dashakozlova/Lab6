package com.lab6;

public abstract class Machine implements Run{

    String name;

    double weight;

    double maxSpeed;

    public Machine(String name, double weight, double maxSpeed) {
        this.name = name;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void move() {
        System.out.println("Machine is moving");
    }
}