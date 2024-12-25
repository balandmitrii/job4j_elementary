package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] arrayArrays = {{1}, {2, 1}, {1, 2, 3}, {4, 3, 2, 1}};
        for (int i = 0; i < arrayArrays.length; i++) {
            System.out.println("Размер вложенного массива с индексом " + i + ": " + arrayArrays[i].length);
        }
    }
}
