package com.company;

import java.io.*;

public class Task2 {
    public static void main (String[] args) {
        lastShortestString("C:\\Users\\serg\\Documents\\lab14_part1.txt");
    }

    public static void lastShortestString(String filename) {

        try (FileInputStream fis = new FileInputStream(filename);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {

            int lineNumber = 0;
            String minStr = null;
            int minLength = 10000;
            int minlen2;

            String str;
            while ((str = br.readLine()) != null) {
                minlen2 = str.length();
                if (minlen2 < minLength) {
                    minLength = minlen2;
                    minStr = str;
                }
                System.out.println(++lineNumber + ": " + str +" ; " + str.length());
            }

            System.out.println(minStr);
        } catch (FileNotFoundException ex) {
            System.out.println("Sorry, no such file");

        } catch (IOException ex) {
            System.out.println("Oops, IO exception");
        }
    }
}


