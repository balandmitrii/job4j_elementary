package ru.job4j.array;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 1; row <= height; row++) {
            for (int col = 1; col <= width; col++) {
                if ((col + row) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
