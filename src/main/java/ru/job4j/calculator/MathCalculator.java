package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumMultiplyAndSum(double a, double b) {
        return sum(a, b) + multiply(a, b);
    }

    public static double sumDivideAndMinus(double a, double b) {
        return divide(a, b) + minus(a, b);
    }

    public static double sumDivideAndMinusAndSumAndMultiply(double a,
                                                            double b) {
        return sumMultiplyAndSum(a, b) + sumDivideAndMinus(a, b);
    }

    public static void main(String[] args) {
        double inputA = 20;
        double inputB = 30;

        double resultSumMultiplyAndSum = sumMultiplyAndSum(inputA, inputB);
        System.out.println("Сумма двух операций (сложение и умножение): " + resultSumMultiplyAndSum);

        double resultSumDivideAndMinus = sumDivideAndMinus(inputA, inputB);
        System.out.println("Сумма двух операций (деление и разность): " + resultSumDivideAndMinus);

        double sumDivideAndMinusAndSumAndMultiply =
                sumDivideAndMinusAndSumAndMultiply(inputA, inputB);
        System.out.println("Сумма четырех операций (сложение, умножение, деление и разность): " + sumDivideAndMinusAndSumAndMultiply);
    }
}
