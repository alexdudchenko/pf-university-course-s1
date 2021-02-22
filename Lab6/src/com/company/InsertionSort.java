package com.company;

public class InsertionSort {
    public static void main(String[] args) {
        byte[] testArray = {1, 2, 9, 8, 7, 4, -128, 127, 45, 74, 85, 84, 96,
                            87, 84, 85, 96, 105, 85, 98, 12, 127, 6, 52, -45, -120};
        ifArray(testArray);
    }

    public static byte[] sort(byte[] array) {

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

    public static void printArray(byte[] array) {
        for(byte i: array) {
            System.out.print(i + " ");
        }
    }

    public static void ifArray(byte[] array) {
        if (array.getClass().isArray()) {
            printArray(sort(array));
        } else {
            System.out.println("Не массив");
        }
    }
}

