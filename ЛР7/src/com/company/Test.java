package com.company;

public class Test {

    public static void main(String[] args) {
        byte[] testArray = {-1, 9, 85, 87, 96, 41, 45, -102, -128, 127, 105, -52};
        ifArray(testArray);
    }

    public static void ifArray(byte[] array) {
        if (array.getClass().isArray()) {
            DataProcessor dp = new DataProcessor(new SelectionSorter(), new RowPrinter());
            dp.process(array);
        } else {
            System.out.println("Не массив");
        }
    }
}
