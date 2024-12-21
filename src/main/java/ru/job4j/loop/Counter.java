package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        if (finish <= start) {
            return 0;
        }

        int sum = 0;

        for (int i = start; i < finish; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 20));
        System.out.println(sum(12, 2));
        System.out.println(sum(13, 45));
    }
}
