package ru.job4j.condition;

public class Vector {
    public static String addVectors(int x1, int y1, int x2, int y2) {
        int sumX = x1 + x2;
        int sumY = y1 + y2;
        return String.format("(%d, %d)", sumX, sumY);
    }

    public static void main(String[] args) {
        int x1 = 4, x2 = 7, y1 = 2, y2 = -5;
        String vectorsSum = addVectors(x1, y1, x2, y2);
        System.out.println("vectors sum: " + vectorsSum);
    }
}
