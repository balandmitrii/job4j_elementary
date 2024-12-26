package ru.job4j.array;

public class Defragmentation {
    public static int[] compress(int[] array) {
        int pointJ = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && pointJ < array.length) {
                if (pointJ < i + 1) {
                    pointJ = i + 1;
                }
                for (int j = pointJ; j < array.length; j++) {
                    if (array[j] != 0) {
                        array[i] = array[j];
                        array[j] = 0;
                        pointJ = j + 1;
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static int[] compress2Point(int[] array) {
        int indexZero = 0;
        int indexNotZero = 0;
        while (indexNotZero < array.length) {
            if (array[indexZero] == 0 && array[indexNotZero] != 0) {
                array[indexZero] = array[indexNotZero];
                array[indexNotZero] = 0;
            }
            if (array[indexZero] != 0) {
                indexZero++;
            }
            indexNotZero++;
        }
        return array;
    }
}
