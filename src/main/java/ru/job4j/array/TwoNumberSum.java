package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int pointStart = 0;
        int pointFinish = array.length - 1;
        while (pointStart < pointFinish) {
            if (array[pointStart] + array[pointFinish] == target) {
                return new int[]{pointStart, pointFinish};
            }

            if (array[pointStart] + array[pointFinish] > target) {
                pointFinish--;
            } else {
                pointStart++;
            }
        }
        return new int[0];
    }
}
