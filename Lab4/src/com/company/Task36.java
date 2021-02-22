package com.company;
import java.lang.Math;

public class Task36 {

    public static void main(String[] args){
        double[] myArray = new double[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Math.random() * 1000;
            System.out.print(myArray[i] + "\t");
        }
        System.out.println("\nСреднее геометрическое - " + geomAvg(myArray));
    }

    public static double geomAvg(double[] a) {

        double min = a[0];
        double max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }
        return Math.sqrt(max * min);
        }

    }

