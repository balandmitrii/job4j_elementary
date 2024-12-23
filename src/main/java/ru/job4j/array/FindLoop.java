package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (i == element) {
                index = i;
                break;
            }
        }
        return index;
    }
}
