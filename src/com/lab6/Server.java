package com.lab6;
import com.lab6.Run;
import com.lab6.Vehicle;

public class Server {

    private int[] countVehicles;

    private int commonCountVehicles;

    private int limitVehicle;

    private Run[] vehicles;


    public Server (int size, int limitVehicle) {
        countVehicles = new int[size];
        this.limitVehicle = limitVehicle;
        //vehicles = new Vehicle[limitVehicle];
        vehicles = new Run[limitVehicle];
    }

    public int getTypesAmount () {
        return countVehicles.length;
    }

    public int getLimitVehicle () {
        return limitVehicle;
    }

    public int getCountVehicles(int i) {
        return countVehicles[i];
    }

    public int getCurrentCountVehicle () {
        return commonCountVehicles;
    }

    public void setLimit (int limitVehicle) {
        this.limitVehicle = limitVehicle;
    }

    public void addTransport (int numberVehicles, Run vehicle) {
        countVehicles[numberVehicles] ++;
        //vehicles [commonCountVehicles] = vehicle;
        vehicles[commonCountVehicles] = vehicle;
        commonCountVehicles ++;
        vehicle.move();
    }
}