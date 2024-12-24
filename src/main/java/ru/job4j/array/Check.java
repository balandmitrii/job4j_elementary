package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean firstValue = data[0];
        for (boolean datum : data) {
            if (datum != firstValue) {
                result = false;
                break;
            }
        }
        return result;
    }
}
