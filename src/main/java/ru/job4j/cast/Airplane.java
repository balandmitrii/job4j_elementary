package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Airplane can fly.");
    }

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName() + " the best for long "
                + "traveling!");
    }
}
