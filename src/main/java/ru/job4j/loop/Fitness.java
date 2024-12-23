package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nikolay) {
        int month = 0;
        while (ivan <= nikolay) {
            ivan *= 3;
            nikolay *= 2;
            month++;
        }
        return month;
    }

    public static void main(String[] args) {
        System.out.println(calc(90, 100));
    }
}
