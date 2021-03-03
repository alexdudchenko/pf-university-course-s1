package com.company;

import java.io.*;

public class Task2 {

    public static void main (String[] args) {
        System.out.println(lastShortestString("C:\\Users\\alexp.DESKTOP-REM2UP4\\Documents\\lab14_part1.txt"));
    }

    public static String lastShortestString(String filename) {

        int lineNumber = 0; //номер текущий строки в файле
        int minLineNumber = 0; //номер минимальной строчки в файле

        String str; //текущая строка
        String minString = null; //минимальная строка

        int minLength = 1000000000; //инициализируем первоначальную минимальную длину очень большим числом
        int tempLength; //временнная длина


        try (FileInputStream fis = new FileInputStream(filename);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {

            while ((str = br.readLine()) != null) {
                lineNumber++;
                tempLength = str.length();

                if (tempLength <= minLength) {
                    minLength = tempLength;
                    minString = str;
                    minLineNumber = lineNumber;
                }

            }

        } catch (FileNotFoundException ex) {
            return ("Sorry, no such file");

        } catch (IOException ex) {
            return ("Oops, IO exception");
        }

        return "Стока # " + minLineNumber + " -- " + minString;
    }
}

