package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bus move by roads.");
    }

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName() + " has a lot of big "
                + "windows");
    }
}
