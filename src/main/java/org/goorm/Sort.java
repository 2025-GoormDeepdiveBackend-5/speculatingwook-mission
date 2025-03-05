package org.goorm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    private static List<Integer> sortToAscendingOrder(int[] array) {
        List<Integer> intList = new ArrayList<>();
        for (int element : array) {
            intList.add(element);
        }

        Collections.sort(intList);
        return intList;
    }

    public static void main(String[] args) {
        int[] ary = {5, 4, 3, 2, 1};
        System.out.println(sortToAscendingOrder(ary));
    }
}
