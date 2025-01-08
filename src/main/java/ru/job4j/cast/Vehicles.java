package ru.job4j.cast;

public class Vehicles {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Bus bus = new Bus();
        Train train = new Train();
        Airplane airplane2 = new Airplane();
        Bus bus2 = new Bus();
        Train train2 = new Train();
        Vehicle[] vehicles = new Vehicle[]{
                airplane,
                bus,
                train,
                airplane2,
                bus2,
                train2,
        };
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.printName();
            System.out.println();
        }
    }
}
