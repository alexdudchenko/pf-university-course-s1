package com.company;

public class BubbleSorter implements Sorter{
    @Override
    public byte[] sort(byte[] array) {
        boolean isSorted = false;
        byte temp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] < array[i+1]) {
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        return array;
    }
}
