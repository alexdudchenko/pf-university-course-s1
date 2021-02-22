package com.company;

import java.util.Scanner;

public class Calc1 {

    public static double calc1(double z, int k) { // считает 1ое
        double result = 0;
        for (int i = 1; i <= k; i++) {
            result = result + ((1 / (Math.sqrt(z * i))) + Math.tan(k / i));
        }
        return result;
    }

    public static int printForK() // ввод числа с регуляцией k < 15
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число k, k < 15 :  ");
        if (sc.hasNextInt()) {
            int k = sc.nextInt();
            if (k < 15 && k > 0) {
                return k;
            } else {
                throw new IllegalArgumentException("Число не из заданого диапазона");
            }
        } else {
            throw new IllegalArgumentException("Вы не ввели число");
        }
    }

    public static double print() // ввод числа
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            return a;
        } else {
            throw new IllegalArgumentException("Вы не ввели число");
        }
    }

}
