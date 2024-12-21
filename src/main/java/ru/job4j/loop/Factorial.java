package ru.job4j.loop;

public class Factorial {
    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        }

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}
