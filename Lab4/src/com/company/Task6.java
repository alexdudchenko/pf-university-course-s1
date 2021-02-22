package com.company;

public class Task6 {

    public static void main(String[] args) {
        int[] myArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] myArray2 = {6, 7, 8, 10, 15, 100, 50, 74};
        int[] myArray3 = {100, 9, 8, 7, 95};
        int[] myArray4 = {2, 0, 6, 85, 986};
        int[] myArray5 = {1, 2, 4, 86};
        int[] myArray6 = null;

        tryFunc(myArray1);
        tryFunc(myArray2);
        tryFunc(myArray3);
        tryFunc(myArray4);
        tryFunc(myArray5);
        tryFunc(myArray6);

    }

    public static void tryFunc(int[] arg) {
        try {
            System.out.println(func(arg));
        }
        catch (IndexOutOfBoundsException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int func(int[] a) {
        if (a == null) {
            throw new NullPointerException("Аргументом был null");
        }
        int k = 0; //счётчик удолетворительных элементов

        int num = 0;
        for (int i: a) {
            if (i % 5 == 0) {
                k++;
            }
        }
        int[] array = new int[k];

        for(int i: a) {
            if (i % 5 == 0 ){
                array[num] = i;
                num++;
            }
        }
        return minElement(array);
    }

    public static int minElement(int[] a){
        if (a.length == 0) {
            throw new IndexOutOfBoundsException("Нет удолетворительных элементов");
        }
        int min = a[0];
        for (int i = 0; i != (a.length - 1); i++) {
            if (min > a[i] && a[i] != 0) {
                min = a[i];
            }
        }
        return min;
    }
}
