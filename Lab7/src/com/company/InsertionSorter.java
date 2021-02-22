package com.company;

public class InsertionSorter implements Sorter{

    @Override
    public byte[] sort(byte[] array) {
        for(int i = 1; i < array.length; i++) {
            byte keyElement = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] < keyElement) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = keyElement;
        }
        return array;
    }
}
