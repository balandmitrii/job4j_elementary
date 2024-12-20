package ru.job4j.converter;

public class Converter {
    public static double rubleToEuro(double value) {
        return value / 70;
    }

    public static double rubleToDollar(double value) {
        return value / 60;
    }
}
