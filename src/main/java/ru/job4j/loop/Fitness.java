package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nikolay) {
        int month = 0;
        int ivanProgress = ivan;
        int nikolayProgress = nikolay;
        while (ivanProgress <= nikolayProgress) {
            ivanProgress *= 3;
            nikolayProgress *= 2;
            month++;
        }
        return month;
    }

    public static void main(String[] args) {
        System.out.println(calc(90, 100));
    }
}
