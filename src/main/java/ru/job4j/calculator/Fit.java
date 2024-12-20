package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 175;
        double manFit = manWeight(manHeight);
        System.out.println("Ideal man fit: " + manFit);

        short womanHeight = 165;
        double womanFit = womanWeight(womanHeight);
        System.out.println("Ideal woman fit: " + womanFit);
    }
}
