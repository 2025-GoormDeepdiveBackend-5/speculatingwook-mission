package org.goorm.sort;

public class SelectionSort implements Sort{
    @Override
    public int[] sort(int[] array) {
        for(int j = 0; j< array.length-1; j++){
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for(int i = j; i<array.length; i++){
                if(min > array[i]){
                    min = array[i];
                    minIndex = i;
                }
            }
            int temp = array[j];
            array[j] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }
}

