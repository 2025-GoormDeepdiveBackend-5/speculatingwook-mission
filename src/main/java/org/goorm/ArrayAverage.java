package org.goorm;

import java.util.Arrays;

public class ArrayAverage {
    private static Double calculateArrayAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return  sum / array.length;
    }

    private static int[] changeArray(int[] array, int index, int value) {
        array[index] = value;
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(calculateArrayAverage(array));

        System.out.println(Arrays.toString(changeArray(array, 3, 10)));
    }
}
