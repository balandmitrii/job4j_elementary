package ru.job4j.condition;

public class Max {
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public int max(int a, int b, int c, int d) {
        return max(max(a, b, c), d);
    }

    public static void main(String[] args) {
        Max max = new Max();
        System.out.println(max.max(5, 1, 3));
    }
}
