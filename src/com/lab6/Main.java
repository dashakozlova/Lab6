package com.lab6;

import com.lab6.Bus;
import com.lab6.Bicycle;
import com.lab6.Car;
import com.lab6.Jumpers;
import com.lab6.RollerSkates;
import com.lab6.Server;
import com.lab6.TractorCrawler;
import com.lab6.TractorWheeled;

public class Main {

    /**
     *Вариант точки входа для первой части задания.
     */
    /*public static void main(String[] args) {
        Server server = new Server(4, 20);
        while(server.getCurrentCountVehicle() < server.getLimitVehicle()) {
            switch (getRandomValue(0, server.getTypesAmount() - 1)) {
                case 0: {
                    server.addTransport(0, new Bicycle());
                }
                case 1: {
                    server.addTransport(1, new Car());
                }
                case 2: {
                    server.addTransport(2, new Jumpers());
                }
                case 3: {
                    server.addTransport(3, new RollerSkates());
                }
            }
        }
        for (int i = 0; i < server.getTypesAmount(); i++) {
            System.out.println(i + " type - " + server.getCountVehicles(i) + " cars");
        }
    }*/

    public static void main(String[] args) {
        Server server = new Server(9, 49);

        while(server.getCurrentCountVehicle() < server.getLimitVehicle()) {

            switch (getRandomValue(0, server.getTypesAmount() - 1)) {
                case 0: {
                    server.addTransport(0, new Bicycle());
                }
                case 1: {
                    server.addTransport(1, new Car());
                }
                case 2: {
                    server.addTransport(2, new Jumpers());
                }
                case 3: {
                    server.addTransport(3, new RollerSkates());
                }
                case 4: {
                    server.addTransport(4, new Bus("Bus", 10000, 120));
                }
                case 5: {
                    server.addTransport(5,
                            new TractorCrawler("Tractor", 12000, 60,"Crawler"));
                }
                case 6: {
                    server.addTransport(6,
                            new TractorWheeled("Tractor", 20000, 50, "Wheeled"));
                }
            }
        }
        for (int i = 0; i < server.getTypesAmount(); i++) {
            System.out.println(i + " type - " + server.getCountVehicles(i) + " cars");
        }

    }

    public static int getRandomValue(int min, int max) {
        return (int) Math.random() * (max - min) + min;
    }
}
