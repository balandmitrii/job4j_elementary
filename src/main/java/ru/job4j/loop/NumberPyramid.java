package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int number) {
        for (int row = 1; row <= number; row++) {
            int columns = number * 2 - 1;
            for (int col = 1; col <= columns; col++) {
                String symbolBefore = col - number + row > 0 ? String.valueOf(col - number + row) : " ";
                String symbolAfter = number - col + row > 0 ? String.valueOf(number - col + row) : " ";
                if (col == number) {
                    System.out.print(row);
                } else if (col < number) {
                    System.out.print(symbolBefore);
                } else {
                    System.out.print(symbolAfter);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        draw(9);
    }
}
