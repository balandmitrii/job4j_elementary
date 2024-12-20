package ru.job4j.condition;

public class Rectangle {
    public static double diagonal(double length, double width) {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    public static void main(String[] args) {
        double length = 14.6, width = 12.4;
        double diagonalResult = diagonal(length, width);
        System.out.println("diagonal: " + diagonalResult);
    }
}
