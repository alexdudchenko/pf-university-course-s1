package com.company;

public class BubbleSort {

    public static void main(String[] args) {
        byte[] testArray = {1, 2, 9, 8, 7, 4, -128, 127, 45, 74, 85, 84, 96,
                87, 84, 85, 96, 105, 85, 98, 12, 127, 6, 52, -45, -120};

        ifArray(testArray);
    }

    public static byte[] bubbleSorter(byte[] array) {
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

    public static void printArray(byte[] array) {
        for(byte i: array) {
            System.out.print(i + " ");
        }
    }

    public static void ifArray(byte[] array) {
        if (array.getClass().isArray()) {
            printArray(bubbleSorter(array));
        } else {
            System.out.println("Не массив");
        }
    }
}
