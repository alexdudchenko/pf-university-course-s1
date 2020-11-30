package com.company;

public class SelectionSorter implements Sorter{
    @Override
    public byte[] sort(byte[] array) {
        int minIndex;
        byte temp;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[minIndex]) {
                    minIndex = j;
                }
            }

            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
