package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0, j = numbers.length; i < j; i++) {
            numbers[i] = i * 2 + 3;
        }
        for (int number : numbers) {
            System.out.println("Значение текущего элемента массива: " + number);
        }
    }
}