package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("The train misses the soft carriages.");
    }

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName() + " the best for "
                + "land long traveling!");
    }
}
