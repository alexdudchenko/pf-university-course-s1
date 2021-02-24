package com.company;

import java.io.*;

public class Task9 {
    public static void main(String[] args) {
        longestZeroSequenceLength("C:\\Users\\serg\\Documents\\lab14_task9.bin");
    }

    public static long longestZeroSequenceLength(String filename) {

        try (FileInputStream fis = new FileInputStream(filename)) {
            int value;
            int counter = 0;
            int maxcounter = 0;
            while ((value = fis.read()) != -1) {
                System.out.print(value);
                System.out.println(" ");
                if (value == 0) {
                    counter++;
                } else {
                    if (maxcounter < counter) {
                        maxcounter = counter;
                    }
                    counter = 0;
                }
            }
            System.out.println("Найдовша послідовність 0 = " + maxcounter);

        } catch (FileNotFoundException ex) {
            System.out.println("Sorry, no such file");
        } catch (IOException ex) {
            System.out.println("Sorry, IO exception");
        }
        return -2;
    }

}
