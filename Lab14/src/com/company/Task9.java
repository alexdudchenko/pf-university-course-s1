package com.company;

import java.io.*;

public class Task9 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\alexp.DESKTOP-REM2UP4\\Documents\\lab14_task9.bin";

        try {
            System.out.println(longestZeroSequenceLength(fileName));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    public static long longestZeroSequenceLength(String filename) {
        int value;
        int counter = 0;
        int maxCounter = 0;

        try (FileInputStream fis = new FileInputStream(filename);
            BufferedInputStream bis = new BufferedInputStream(fis)) {

            while ((value = bis.read()) != -1) {
                if (value == 0) {
                    counter++;
                } else {
                    if (maxCounter < counter) {
                        maxCounter = counter;
                    }
                    counter = 0;
                }
            }

        } catch (FileNotFoundException ex) {
            throw new RuntimeException("Sorry, no such file", ex);
        } catch (IOException ex) {
            throw new RuntimeException("Sorry, IO exception", ex);
        }
        return maxCounter;
    }

}
