package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    private static int sum(int y) {
        return x + y;
    }

    private static int minus(int y) {
        return y - x;
    }

    public int multiply(int y) {
        return y * x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        int y = 10;
        int resultSum = sum(y);
        System.out.println("sum: " + resultSum);
        int resultMinus = minus(y);
        System.out.println("minus: " + resultMinus);
        Calculator calculator = new Calculator();
        int resultMultiply = calculator.multiply(y);
        System.out.println("multiply: " + resultMultiply);
        int resultDivide = calculator.divide(y);
        System.out.println("divide: " + resultDivide);
        int resultAllOperation = calculator.sumAllOperation(y);
        System.out.println("sumAllOperation: " + resultAllOperation);
    }
}
