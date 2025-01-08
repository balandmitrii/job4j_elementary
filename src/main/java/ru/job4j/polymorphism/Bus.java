package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Bus is moving.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Bus has 100 passengers.");
    }

    @Override
    public int refuel(int fuel) {
        return 100;
    }
}
